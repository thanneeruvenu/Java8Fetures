package com.vt.interfacefunction;

public class NonStaticMethodInterfaceImpl implements NonStaticMethodInterface {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		NonStaticMethodInterfaceImpl obj = new NonStaticMethodInterfaceImpl();
		obj.print("");
		obj.isNull("abc");
	}
}
