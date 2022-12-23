package com.shaan.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.shaan.comp.BlueDart;
import com.shaan.comp.Courier;
import com.shaan.comp.DHL;
import com.shaan.comp.DTDC;
import com.shaan.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	 static {
		 try (//Load Properties file			  
			 FileInputStream fis=new FileInputStream("src/main/java/com/shaan/commons/info.properties")){
			 //Load properties file content to java.util.Properties class obj
			 props=new Properties();
			 props.load(fis);
		 }//try
		 catch (Exception e) {
			e.printStackTrace();
		}
	 }
	//static factory method supporting Factory pattern
	public static Flipkart createFlipkart()throws Exception {
		//create target class object
		Flipkart fpkt=new Flipkart();
		
		//Load Dependent class
		Class c=Class.forName(props.getProperty("dependent.comp"));
		//Create  Object using reflection object
		Constructor cons[]=c.getDeclaredConstructors();
		//create object
		Courier courier=(Courier) cons[0].newInstance();

		//set Dependent class object to target class obj
		 fpkt.setCourier(courier);
		 return fpkt;
		
		
	}

}
