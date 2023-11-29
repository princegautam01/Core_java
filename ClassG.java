package com.package1;

public class ClassG {
    int meth1()
    {
    	System.out.println("Hi");
    	return 100;
    }
    int meth2(String s)
    {
    	System.out.println(s);
    	return 900;
    }
    int meth3()
    {
    	System.out.println("Java is Awesome");
    	return new ClassG().meth1()+ new ClassG().meth2("Java");
    }
    public static void main(String[] args) {
		System.out.println(new ClassG().meth3());
	}
}
