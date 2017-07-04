package com.tongxing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesUtils {
	private static final Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);
	private final static Properties properties = new Properties();
	
	static {
		try {
			FileInputStream fileInputStream = new FileInputStream(new File(PropertiesUtils.class.getResource(
					"/system.properties").toURI()));
			InputStreamReader inputStrReader = new InputStreamReader(fileInputStream, "UTF-8");
			properties.load(inputStrReader);
			inputStrReader.close();
			fileInputStream.close();
		} catch (Exception e) {
			logger.error("PropertiesUtils init error", e);
			throw new IllegalArgumentException(e);
		}
	}
	/**
	 * 根据属性名获取其String值
	 * 
	 * @param name
	 * @param defaultValue
	 * @return
	 */
	public static String getProperty(String name, String defaultValue) {
		String value = properties.getProperty(name);
		return value == null ? defaultValue : value;
	}
 
	
	
}
