package com.shaan.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalcIntrestAmountReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("CalcIntrestAmountReplacer.reimplement() (Simple Intrest)");
		//get target method arg values//
		double pamt=(double)args[0];
		double rate= (double)args[1];
		double time=(double)args[2];
		//write new logic to execute (simpleIntrest amount)
		return (pamt*rate*time)/100;
		
	}

}
