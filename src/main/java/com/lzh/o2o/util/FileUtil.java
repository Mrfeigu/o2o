package com.lzh.o2o.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FileUtil {
	private static String seperator = System.getProperty("file.separator");//获取不同系统的文件分割符
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat(
			"yyyyMMddHHmmss"); // 时间格式化的格式
	private static final Random r = new Random();//随机种子

	/**
	 * 获取图片的根本存储路径
	 * @return
	 */
	public static String getImgBasePath() {
		String os = System.getProperty("os.name");//获取操作系统类型
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {//判断是否是win类型
			basePath = "D:/projectdev/image/";//win类型的分割符号是反斜杠
		} else {
			//basePath = "/home/xiangzepro/";
			basePath = "/home/pda/";//linux与macos分割符号是斜杠
		}
		basePath = basePath.replace("/", seperator);//将分割符替换成系统分割符号
		return basePath;
	}

	/**
	 * 获取图片的文件夹的相对路径
	 * 这个是关于头条信息的图片路径
	 * @return
	 */
	public static String getHeadLineImagePath() {
		String headLineImagePath = "/upload/images/item/headtitle/";
		headLineImagePath = headLineImagePath.replace("/", seperator);
		return headLineImagePath;
	}

	/**
	 * 获取商店目录的图片文件夹相对路径
	 * @return
	 */
	public static String getShopCategoryImagePath() {
		String shopCategoryImagePath = "/upload/images/item/shopcategory/";
		shopCategoryImagePath = shopCategoryImagePath.replace("/", seperator);
		return shopCategoryImagePath;
	}
	
	/**
	 * 获取个人信息的图片相对路径
	 * @return
	 */
	public static String getPersonInfoImagePath() {
		String personInfoImagePath = "/upload/images/item/personinfo/";
		personInfoImagePath = personInfoImagePath.replace("/", seperator);
		return personInfoImagePath;
	}

	/**
	 * 通过商店id获取商店图片的相对路径
	 * @param shopId
	 * @return
	 */
	public static String getShopImagePath(long shopId) {
		StringBuilder shopImagePathBuilder = new StringBuilder();
		shopImagePathBuilder.append("/upload/images/item/shop/");
		shopImagePathBuilder.append(shopId);
		shopImagePathBuilder.append("/");
		String shopImagePath = shopImagePathBuilder.toString().replace("/",
				seperator);
		return shopImagePath;
	}

	/**
	 * 生成随机文件名称
	 * 随机名格式：当前的年月日时分秒+5位随机数
	 * @return
	 */
	public static String getRandomFileName() {
		int rannum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000; // 获取随机数
		String nowTimeStr = sDateFormat.format(new Date()); // 当前时间
		return nowTimeStr + rannum;
	}

	/**
	 * 删除文件
	 * @param storePath
	 */
	public static void deleteFile(String storePath) {
		File file = new File(getImgBasePath() + storePath);
		if (file.exists()) {
			if (file.isDirectory()) {
				File files[] = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					files[i].delete();
				}
			}
			file.delete();
		}
	}
}
