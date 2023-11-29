
//Wap to find GCD of two numbers
import java.util.*;

public class GCD {
    // creating a method for calculating gcd with arguments a , b
    static void myGcd(int a, int b) {
        if (a == 0) {
            System.out.println("GCD is: " + b);
        }
        if (b == 0) {
            System.out.println("GCD is: " + a);
        } else {
            myGcd(b, a % b); // Here we are using recursion
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        myGcd(a, b); // Output will be the gcd of two numbers provided by the user

    }
}
// program by prince gautam
