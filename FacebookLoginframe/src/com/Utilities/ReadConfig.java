package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig() {
		
	
	File src =new File("./configurations/config.properties");
	
	try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}catch(Exception e) {
		System.out.println("Exceptioon is" + e.getMessage());
		
	}
	}
	
public String getApplicationURL() {
	String url = pro.getProperty("baseURL");
	return url;
	
}
public String getUsername() {
	String username= pro.getProperty("username");
	return username;
	
}
public String getPassword() {
	String Password = pro.getProperty("password");
	return Password;
		
}
public String getChromepath() {
	String chromepath= pro.getProperty("chromepath");
	return chromepath;
	
}
public String getIEpath() {
	String iepath= pro.getProperty("iepath");
	return iepath;
	
}

	
	
	
	

}
