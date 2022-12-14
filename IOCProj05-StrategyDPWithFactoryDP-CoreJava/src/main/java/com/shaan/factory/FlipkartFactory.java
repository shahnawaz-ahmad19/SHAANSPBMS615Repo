package com.shaan.factory;

import com.shaan.comp.BlueDart;
import com.shaan.comp.Courier;
import com.shaan.comp.DTDC;
import com.shaan.comp.Flipkart;

public class FlipkartFactory {
	
	//static factory method supporting Factory pattern
	public static Flipkart createFlipkart(String courierType) {
		//create target class object
		Flipkart fpkt=new Flipkart();
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("bDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("Invalid courierType");
		//set Dependent class object to target class obj
		 fpkt.setCourier(courier);
		 return fpkt;
		
		
	}

}
