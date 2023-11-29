//Wap to demostrate Type Casting
// Type Casting is when you assign value of a primitive data type to another type
// There are two aspects of type casting:
// 1.widening casting : Convert smaller type to larger type "Automatically"
// 2. narrowing casting : Convert larger type to smalller type "manually"
public class Type_Casting_demo {
    public static void main(String args[]) {
        int myint = 9;
        double mydouble = myint; // Converts Automatically
        System.out.println("Widening Type Casting");
        System.out.println(myint); // output 9
        System.out.println(mydouble); // output 9.0
        double mydouble2 = 9.65;
        int myint2 = (int) mydouble2;
        System.out.println("Narrowing Type Casting");
        System.out.println(mydouble2); // Output 9.65
        System.out.println(myint2); // Output 9
    }

}
// Program By Prince Gautam
