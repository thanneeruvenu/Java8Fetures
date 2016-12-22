package com.vt.interfacefunction;

public class StaticMethodInterfaceImpl implements StaticMethodInterface {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		StaticMethodInterfaceImpl obj = new StaticMethodInterfaceImpl();
		obj.print("");
		obj.isNull("abc");
	}
}
