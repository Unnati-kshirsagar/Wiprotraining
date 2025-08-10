package com.wirpo.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(1);
		list.add("Unnati");
		list.add(12.2);
		System.out.println(list.size());
		list.remove(12.3);
		System.out.println(list.size());

	}

}
