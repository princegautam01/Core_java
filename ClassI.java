package com.package1;

public class ClassI {
      String meth1(int a , int b)
      {
    	  System.out.println(10);
    	  System.out.println((54+a)- b);
    	  int value = new ClassI().meth5();
    	  System.out.println(value);
    	  return "Java";
      }
      int meth2(int a)
      {
    	  System.out.println(75);
    	  int b = 5;
    	  System.out.println(b-a);
    	  return (5*5) - b;
      }
      void meth3()
      {
    	  System.out.println("START");
    	  System.out.println(new ClassI().meth4());
    	  System.out.println(40);
    	  
      }
      String meth4()
      {
    	  System.out.println("Today is Monday");
    	  return new ClassI().meth1(4, 8);
      }
      int meth5()
      {
    	  ClassI obj = new ClassI();
    	  System.out.println(99);
    	  return obj.meth2(5);
      }
      public static void main(String[] args) {
		ClassI obj = new ClassI();
		obj.meth3();
	}
}
