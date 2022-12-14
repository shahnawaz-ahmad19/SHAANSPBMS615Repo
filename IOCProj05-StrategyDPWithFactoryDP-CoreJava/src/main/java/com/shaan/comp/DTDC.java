//DTDC.java(dependent class 2)
package com.shaan.comp;

public final class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		return oid+" order id order is delivered by DTDC";
	}

}
