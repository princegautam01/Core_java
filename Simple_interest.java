
//Wap to calculate the simple interest and input by the user
import java.util.*;

public class Simple_interest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount:");
        int p = sc.nextInt();// user input for principal
        System.out.println("Enter the rate:");
        float r = sc.nextFloat();// user input for rate
        System.out.println("Enter time:");
        float t = sc.nextFloat(); // user input for time
        sc.close();
        float si = (p * r * t) / 100; // si variable will store the calculation
        System.out.println("The simple interest is :" + si);

    }

}
// program by prince gautam