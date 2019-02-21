package com.lzh.o2o.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public class QRCodeUtil {
	
	/**
	 * 生成内容为url的二维码信息，格式是png，返回BitMatrix
	 * @param url
	 * @param resp
	 * @return
	 */
	public static BitMatrix generateQRCodeStream(String url,
			HttpServletResponse resp) {
		resp.setHeader("Cache-Control", "no-store");
		resp.setHeader("Pragma", "no-cache");
		resp.setDateHeader("Expires", 0);
		resp.setContentType("image/png");
		Map<EncodeHintType, Object> hints = new HashMap<>();
		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		hints.put(EncodeHintType.MARGIN, 0);
		BitMatrix bitMatrix;
		try {
			/*bitMatrix = new MultiFormatWriter().encode("https://www.baidu.com",
					BarcodeFormat.QR_CODE, 300, 300, hints);*/
			
			bitMatrix = new MultiFormatWriter().encode( url,
					BarcodeFormat.QR_CODE, 300, 300, hints);
			
		} catch (WriterException e) {
			e.printStackTrace();
			return null;
		}
		return bitMatrix;
	}
}
