package com.vt.interfacefunction;

public class FunctionInterfaceImpl implements Interface1 ,Interface2 {

	@Override
	public void method2() {
  		
	}

	@Override
	public void method1() {
		
	}
	
	// if you don't override below method then compiler will gives an error says that duplicate methods are not allowed
	@Override
	public void log(String s){
		System.out.println("impl class : "+s);
	}

	public static void main(String[] args) {
		
		//case 1
		Interface1 interface1 = new FunctionInterfaceImpl();
		interface1.log("Hello");
		
		//not possible to call through object
		Interface1.print("Hai");
		
		
	}
	
	
}
