package com.vt.interfacefunction;

public class Interface1Impl implements Interface1{


	@Override
	public void method1() {
		
	}
	
	@Override
	public void log(String s) {
		System.out.println("Impl log method : "+s);
	}
	
	//The method print(String) of type Interface1Impl must override or implement a supertype method
	// we can not override interface static method
	//@Override
	 static void print(String msg){
		System.out.println("impl print method :"+msg);
	}
	
	
	public static void main(String[] args) {

		Interface1Impl interface1Impl = new Interface1Impl();
		interface1Impl.log("Hello");
		interface1Impl.print("Hai");
		
		Interface1 interface1 = new Interface1Impl();
		interface1.log("Hello");
		//This static method of interface Interface1 can only be accessed as Interface1.print
		//interface1.print("Hai");
	}

}
