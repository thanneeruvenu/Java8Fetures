package com.vt.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<=10;i++) list.add(i);
		
		// using iterator
		System.out.println("===== iterator ======");
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		// using for each loop 
		System.out.println("===== for each loop ======");
		for(Integer value: list){
			System.out.println(value);
		}
		
		// java 8 for each loop
		System.out.println("===== java 8 for each loop =====");
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		});
		// java 8 for each with custom consumer implementation
		System.out.println("==== java 8 for each loop with custom consumer implementation ====");
		MyConsumer action = new MyConsumer();
		list.forEach(action);
	}
	
}
