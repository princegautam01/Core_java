package com.package1;

public class ClassH {
      int meth1(int a , int b , char c)
      {
    	  System.out.println(c);
    	  int result = new ClassH().meth2("Java" , 100 , 'Y');
    	  return 10 + a + result;
      }
      int meth2(String s , int a , char c)
      {
    	  System.out.println(s);
    	  System.out.println(c);
    	  return 20;
      }
      public static void main(String[] args) {
		System.out.println(new ClassH().meth1(10, 20, 'X'));
	}
      
}
