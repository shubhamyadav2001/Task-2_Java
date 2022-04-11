import java.util.Scanner;

public class Program5 {
    // write a java program to calculate permutation and combination of 2 numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1(n) : ");
        int n = sc.nextInt();
        System.out.println("Enter the num2(r) : ");
        int r = sc.nextInt();

        int permutation = (factorial(n)/(factorial(n-r)*factorial(r)));
        int combination = (factorial(n) / (factorial(n - r)));

        System.out.print("NCR is " +permutation);
        System.out.print("\nNPR is " +combination);
    }

    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i<=n;i++) {
            fact = fact*i;
        }
        return fact;
    }
}