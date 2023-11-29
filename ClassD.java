package com.package1;

public class ClassD {
    int meth1(int x , String s)
    {
    	System.out.println("Hi");
    	System.out.println(s);
    	return x/2;
    }
    public static void main(String[] args) {
		System.out.println(new ClassD().meth1(10, "Java")*2);
	}
}
