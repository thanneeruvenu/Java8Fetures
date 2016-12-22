package com.vt.interfacefunction;

@FunctionalInterface
public interface Interface1 {

	void method1();
	
	// if you specified interface as @FunctionalInterface then it will not allow more than one abstract methods
	//void printMessage(String msg);
	
	default void log(String s){
		System.out.println("interface1 log method : "+s);
	}
	
	static void print(String msg){
		System.out.println("interface1 print method :"+msg);
	}
	
	//A default method cannot override a method from java.lang.Object 
/*	default String toString() {
		return "inteface1";
	}*/
}
