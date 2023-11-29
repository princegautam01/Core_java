package com.package1;

public class ClassK {
   public String testmethod1()
   {
	   System.out.println(35);
	   return new ClassK().testmethod3(new ClassK().testmethod2()) + new ClassK().testmethod4("Here");
	   
   }
   public int testmethod2()
   {
	   System.out.println(25);
	   return 25+5;
   }
   public String testmethod3(int a)
   {
	   System.out.println(15);
	   return "is";
   }
   public String testmethod4(String s)
   {
	   System.out.println(45);
	   return "Awesome";
   }
   public static void main(String[] args) {
	ClassK t = new ClassK();
	System.out.println("Java " + t.testmethod1());
}
   
}
