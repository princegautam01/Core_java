package com.package1;

public class ClassF {
     int meth1()
     {
    	 System.out.println("Hi");
    	 return 100;
     }
     void meth2(int x)
     {
    	 System.out.println("x: "+x);
    	 System.out.println("Java is Awesome");
     }
     public static void main(String[] args) {
		ClassF aobj = new ClassF();
		aobj.meth2(aobj.meth1() + 900);
	}
}
