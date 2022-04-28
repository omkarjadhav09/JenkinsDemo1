package com.testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	public static String getBrowerName() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Omkar Jadhav\\Documents\\Workspace\\TestDemo\\src\\main\\resources\\config.properties");
		prop.load(file);
		String browserName = prop.getProperty("browser_name");
		System.out.println(browserName);
		return browserName;
	}
	
	public static String getBaseURL() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Omkar Jadhav\\Documents\\Workspace\\TestDemo\\src\\main\\resources\\config.properties");
		prop.load(file);
		return prop.getProperty("home_url");
	}
	

}
