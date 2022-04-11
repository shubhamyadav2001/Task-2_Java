import java.util.Scanner;

public class Program7 {
    // Write a Java Program to reverse the letters present in the given String.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseS(str);
    }
    public static void reverseS(String str) {
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}