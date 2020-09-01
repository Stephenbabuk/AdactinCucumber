package com.adactin.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReaderPractice {
	
	public static Properties p;
	
	public ConfigurationReaderPractice() throws IOException {
		File f= new File("src\\test\\java\\com\\adactin\\properties\\Adactin\\properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		 p.load(fis);
	}
	public String getBrowserName() {
		String browsername = p.getProperty("chrome");
		return browsername;

	}
	public String getUrl() {
		String url = p.getProperty("Url");
		return url;

	}

}
