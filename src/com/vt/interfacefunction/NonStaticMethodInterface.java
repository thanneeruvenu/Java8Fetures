package com.vt.interfacefunction;

public interface NonStaticMethodInterface {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("Non StaticMethodInterface Print::" + str);
	}

	default boolean isNull(String str) {
		System.out.println("Non StaticMethodInterface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
