package com.package1;

public class ClassL {
    int meth1(int a, int b)
    {
    	System.out.println(a);
    	return new ClassL().meth2(5 , "hehe");
    }
    int meth2(int x , String s)
    {
    	System.out.println(45);
    	return new ClassL().meth3(new ClassL().meth4(5 , 5 , "Hi"));
    }
    int meth3(int x)
    {
    	System.out.println(100);
    	return 0;
    }
    int meth4(int a , int b , String s )
    {
    	System.out.println(a+a);
    	return a+ b;
    }
    public static void main(String[] args) {
		ClassL obj = new ClassL();
		System.out.println(obj.meth1(15, 10));
	}
}
