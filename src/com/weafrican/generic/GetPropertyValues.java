package com.weafrican.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyValues {
	static String filepath=".//Config.properties";
	/** getPropertyValues method is used to read the url on the basic of key*/ 
	public static String getPropertyValues(String key) {
		String data="";
		Properties prop =new Properties();
		try {
			prop.load(new FileInputStream(new File(filepath)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
