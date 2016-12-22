package com.vt.interfacefunction;

public interface Interface2 {

	void method2();
	
	default void log(String s){
		System.out.println("interface2 log method : "+s);
	}
	
	static void print(String msg){
		System.out.println("interface2 print method :"+msg);
	}
}
