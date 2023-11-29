package com.package1;

public class ClassB {
	int meth1()
	{
		System.out.println("Hi");
		return 1;
	}
	int meth2()
	{
		System.out.println("Hello");
		return 99;
	}
	public static void main(String[] args) {
		System.out.println("------------------------");
		System.out.println("=>"+new ClassB().meth1());
		System.out.println("=>"+new ClassB().meth2());
	}

}
