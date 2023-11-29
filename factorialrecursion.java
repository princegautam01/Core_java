
//Wap to find factorial of a number using recursion
import java.util.*;

public class factorialrecursion {
    // Method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);// <--- Recursion
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        sc.close();
        fact = factorial(n);// passing the argument "n" to factorial method and storing it inside variable
                            // fact
        System.out.println("Factorial of " + n + " " + "is" + " " + fact);

    }

}
// program by prince gautam
