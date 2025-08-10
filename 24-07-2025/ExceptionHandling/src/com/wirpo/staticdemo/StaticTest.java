package com.wirpo.staticdemo;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo demo1=new StaticDemo();
		demo1.StaticData=17;
		demo1.nonStatic=10;
		
		StaticDemo demo2=new StaticDemo();
		System.out.println(demo2.StaticData);
		System.out.println(demo2.nonStatic);

	}

}
