package com.package1;

public class ClassA {
       int meth1()
	{
		System.out.println("meth1() called");
		return 10;
	}
       public static void main(String[] args)
       {
		System.out.println("Hello World");
		ClassA obj = new ClassA();
		int x = obj.meth1();
		System.out.println(x);
	   }

}
