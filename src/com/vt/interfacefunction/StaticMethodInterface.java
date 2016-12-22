package com.vt.interfacefunction;

public interface StaticMethodInterface {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("StaticMethodInterface Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("StaticMethodInterface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
