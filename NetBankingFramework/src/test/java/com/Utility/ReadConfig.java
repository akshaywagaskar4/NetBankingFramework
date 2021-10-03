package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties p;
	
	public ReadConfig() {	//constructor
		
		File f= new File("E:\\Velocity\\Eclipse_Workspace_2021_03\\NetBankingFramework\\Configuration\\Config.properties");
		
		try {
			FileInputStream input= new FileInputStream(f);
			p=new Properties();
			p.load(input);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getKey() {
		String Chromekey = p.getProperty("key");
		return Chromekey;
	}
	public String getValue() {
		String ChromeValue=p.getProperty("value");
		return ChromeValue;
	}
	public String getURL() {
		String URL= p.getProperty("baseURL");
		return URL;
	}
	public String getUser() {
		String username=p.getProperty("USERNAME");
		return username;
	}
	public String getPass() {
		String password=p.getProperty("Password");
		return password;
	}

}
