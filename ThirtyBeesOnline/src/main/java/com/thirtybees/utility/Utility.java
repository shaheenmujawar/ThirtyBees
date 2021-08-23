package com.thirtybees.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Utility {
	public static Properties readPropertiesFile(String fileName) {
		Properties prop = null;
		   FileInputStream fis;
		   try {
			   
			fis = new FileInputStream("config.properties");
				 prop = new Properties();
				 prop.load(fis);
			}catch(Exception e) {
				e.printStackTrace();
			}
		return prop;
		
	}

	
}
