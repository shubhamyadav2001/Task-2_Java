import java.util.Scanner;

public class Program2 {
    // Write a Java program to calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        series(n);
    }

    public static void series(int n) {
        int first = 0;
        int second = 1;
        for(int i = 0; i<= n; i++) {
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }

    }

}