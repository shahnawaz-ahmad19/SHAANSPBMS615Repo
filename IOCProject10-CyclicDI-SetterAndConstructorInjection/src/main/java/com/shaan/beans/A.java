package com.shaan.beans;

public class A {
	private B b;
	
	public A() {
		System.out.println("A:: 0-param c onstructor")    ;
	}
	
   public void setB(B b) {
	   System.out.println("A.setB()");
	   this.b=b;
   }

	@Override
	public String toString() {
		return "A [b=]";
	}


}
