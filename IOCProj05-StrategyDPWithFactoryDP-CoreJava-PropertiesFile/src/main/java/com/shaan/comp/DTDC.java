//DTDC.java(dependent class 2)
package com.shaan.comp;

public final class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC :: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid+" order id order is delivered by DTDC";
	}


}
