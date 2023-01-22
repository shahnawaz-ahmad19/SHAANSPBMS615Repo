package com.shaan.service;

public class BankService {
	public double calcIntrestAmount(double pamt, double rate,double time) {
		System.out.println("BankService.calcIntrestAmount() (compound Intrest)");
		//calculate compound intrest amount
		return (pamt*Math.pow(1+rate/100, time))-pamt;
		
	}

}
