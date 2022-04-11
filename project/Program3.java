import java.util.Scanner;

public class Program3 {
    // Write a Java program to calculate a Factorial of a number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        factorial(n);
    }

    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = i * fact;
        }
        System.out.println("Factorial of "+n+" is : "+fact);
    }

}
