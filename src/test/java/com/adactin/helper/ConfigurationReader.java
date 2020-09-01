package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		File f = new File("src\\test\\java\\com\\adactin\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		 p.load(fis);
	}
	
	public String getBrowserName() {
		String browsername = p.getProperty("BrowserName");
		return browsername;

	}
	public String getUrl() {
		String url = p.getProperty("Url");
		return url;

	}
	
	/*
	 * public static void main(String[] args) throws IOException {
	 * ConfigurationReader c = new ConfigurationReader(); String browserName =
	 * c.getBrowserName(); System.out.println(browserName); String url = c.getUrl();
	 * System.out.println(url); }
	 */
			
}
