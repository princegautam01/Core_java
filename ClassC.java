package com.package1;

public class ClassC {
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
	public static void main(String[] args) 
	{
		ClassC aobj = new ClassC();
		System.out.println("Addition "+(aobj.meth1() + aobj.meth2()));
	}

}
