package br.crm.service.impl.order.wxpay;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.common.wxpay.utils.ClientCustomSSL;
import br.crm.common.wxpay.utils.HttpUtil;
import br.crm.common.wxpay.utils.PayCommonUtil;
import br.crm.common.wxpay.utils.PayConfigUtil;
import br.crm.common.wxpay.utils.RequestHandler;
import br.crm.common.wxpay.utils.XMLUtil;
import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.order.CustomerOrderPayInfo;
import br.crm.service.customer.order.CustomerOrderPayInfoService;
import br.crm.service.customer.order.CustomerOrderService;
import br.crm.service.customer.order.wxpay.WxpayService;

@Service
public class WxpayServiceImpl implements WxpayService {

	@Override
	public String createOrderInfo(CustomerOrder customerOrder) {

		int totalMoney = 0;
		BigDecimal moneyStr = customerOrder.getOrderAmount();
		BigDecimal money = moneyStr.multiply(new BigDecimal(100));
		totalMoney = money.intValue();
		SortedMap<Object, Object> packageParams = new TreeMap<Object, Object>();
		packageParams.put("appid", PayConfigUtil.APP_ID);// 公众账号appid
		packageParams.put("mch_id", PayConfigUtil.mch_id);// 商户号
		packageParams.put("nonce_str", PayCommonUtil.getRandomStringByLength(32)); // 随机字符串
		packageParams.put("body", PayConfigUtil.body);// 商品名称
		packageParams.put("out_trade_no", customerOrder.getOrderNo()); // 商户订单号
		packageParams.put("total_fee", totalMoney); // 标价金额(默认是分)
		packageParams.put("spbill_create_ip", PayCommonUtil.localIp()); // 终端IP:114.215.222.233
		packageParams.put("notify_url", PayConfigUtil.NOTIFY_URL); // 通知地址
		packageParams.put("trade_type", PayConfigUtil.trade_type); // 交易类型
		String sign = PayCommonUtil.createSign("UTF-8", packageParams, PayConfigUtil.API_KEY);
		packageParams.put("sign", sign);
		String requestXML = PayCommonUtil.getRequestXml(packageParams);// 将请求参数转换为xml格式的string
		String resXml = HttpUtil.postData(PayConfigUtil.PAY_API, requestXML);
		try {
			Map map = XMLUtil.doXMLParse(resXml);
			String urlCode = (String) map.get("code_url");
			return urlCode;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Map<String,String> refund(CustomerOrder customerOrder, CustomerOrderPayInfo orderPayInfo, String orderRefundId) {
		Map<String,String> map= new HashMap<String,String>();
		int totalMoney = 0;
		int refundMoney = 0;
		BigDecimal moneyStr = customerOrder.getOrderAmount();
		BigDecimal money = moneyStr.multiply(new BigDecimal(100));
		totalMoney = money.intValue();//付款金额
		BigDecimal orderPayAmount = orderPayInfo.getOrderPayAmount();
		BigDecimal money2 = orderPayAmount.multiply(new BigDecimal(100));
		 refundMoney=money2.intValue();//订单支付明细-----里面的金额
		if (totalMoney == refundMoney) {
			// 定义参数
			String out_refund_no = orderRefundId;// 退款单号
			String out_trade_no = customerOrder.getOrderNo();// 订单号
			String total_fee = totalMoney + "";// 总金额
			String refund_fee = refundMoney + "";// 退款金额
			String nonce_str = PayCommonUtil.getRandomStringByLength(32);// 随机字符串
			String appid = PayConfigUtil.APP_ID; // 微信公众号apid
			String appsecret = PayConfigUtil.AppSecret; // 微信公众号appsecret
			String mch_id = PayConfigUtil.mch_id; // 微信商户id
			String op_user_id = PayConfigUtil.mch_id;// 就是MCHID
			String partnerkey = PayConfigUtil.API_KEY;// 商户平台上的那个KEY
			SortedMap<Object, Object> packageParams = new TreeMap<Object, Object>();
			packageParams.put("appid", appid);
			packageParams.put("mch_id", mch_id);
			packageParams.put("nonce_str", nonce_str);
			packageParams.put("out_trade_no", out_trade_no);// 商户订单号
			packageParams.put("out_refund_no", out_refund_no);
			packageParams.put("total_fee", total_fee);
			packageParams.put("refund_fee", refund_fee);
			packageParams.put("op_user_id", op_user_id);
			RequestHandler reqHandler = new RequestHandler(null, null);
			reqHandler.init(appid, appsecret, partnerkey);
			String sign = reqHandler.createSign(packageParams);
			String xml = "<xml>" + "<appid>" + appid + "</appid>" + "<mch_id>" + mch_id + "</mch_id>" + "<nonce_str>" + nonce_str + "</nonce_str>" + "<sign><![CDATA[" + sign + "]]></sign>" + "<out_trade_no>" + out_trade_no + "</out_trade_no>" + "<out_refund_no>" + out_refund_no + "</out_refund_no>" + "<total_fee>" + total_fee + "</total_fee>" + "<refund_fee>" + refund_fee + "</refund_fee>" + "<op_user_id>" + op_user_id + "</op_user_id>" + "</xml>";
			System.out.println("xml..."+xml);
			// 请求微信退款
			try {
				String resultRefund = ClientCustomSSL.doRefund(PayConfigUtil.payrefund, xml);
				System.out.println("resultRefund....." + resultRefund);
				Map<String, String> getMap = parseXml(new String(resultRefund.toString().getBytes(), "utf-8"));
				System.out.println("getMap" + getMap);
				// 申请微信退款成
				if("SUCCESS".equals(getMap.get("return_code"))){
					String result_code = (String) getMap.get("result_code"); //SUCCESS退款申请接收成功，结果通过退款查询接口查询 
					String app_id = (String) getMap.get("appid"); //公众账号ID
					String mchid = (String) getMap.get("mch_id"); //商户号
					String noncestr = (String) getMap.get("nonce_str"); //随机字符串
					String si_gn = (String) getMap.get("sign"); //签名
					String transaction_id = (String) getMap.get("transaction_id"); //微信订单号
					String outtradeno = (String) getMap.get("out_trade_no"); //商户订单号
					String outrefundno = (String) getMap.get("out_refund_no"); //商户退款单号
					String refund_id = (String) getMap.get("refund_id"); //微信退款单号
					String refundfee = (String) getMap.get("refund_fee"); //微信退款金额
					String totalfee = (String) getMap.get("total_fee"); //标价金额
					String cash_fee = (String) getMap.get("cash_fee"); //现金支付金额
					System.out.println("result_code........."+result_code);
					System.out.println("app_id........."+app_id);
					System.out.println("mchid........."+mchid);			
					System.out.println("noncestr........."+noncestr);			
					System.out.println("si_gn........."+si_gn);			
					System.out.println("transaction_id........."+transaction_id);			
					System.out.println("outtradeno........."+outtradeno);			
					System.out.println("outrefundno........."+outrefundno);			
					System.out.println("refund_id........."+refund_id);			
					System.out.println("refundfee........."+refundfee);			
					System.out.println("totalfee........."+totalfee);			
					System.out.println("cash_fee........."+cash_fee);
					map.put("result_code", "SUCCESS");
					map.put("appid", app_id);
					map.put("mch_id", mchid);
					map.put("nonce_str", noncestr);
					map.put("sign", si_gn);
					map.put("transaction_id", transaction_id);//微信订单号
					map.put("out_trade_no", outtradeno);//商户系统内部的订单号
					map.put("out_refund_no", outrefundno);//商户退款单号
					map.put("refund_id", refund_id);//微信退款单号
					map.put("refund_fee", refundfee);//退款金额
					map.put("total_fee", totalfee);//标价金额
					map.put("cash_fee", cash_fee);//现金支付金额
					return map;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		map.put("state", "FAIL");

		return map;
	}

	public static Map<String, String> parseXml(String xml) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		try {
			Document document = DocumentHelper.parseText(xml);
			Element root = document.getRootElement();
			List<Element> elementList = root.elements();
			for (Element e : elementList) {
				map.put(e.getName(), e.getText());
				System.out.println(e.getName() + ":" + e.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

}
