import java.util.Scanner;

public class Program4 {
    // Write a Java program to find out whether the given String is Palindrome or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        String num = sc.nextLine();

        palindrome(num);
    }

    public static void palindrome(String num) {
        String reverse = "";

        for(int i = num.length()-1; i>=0;i-- ) {
            reverse = reverse + num.charAt(i);
        }
        if(num.equals(reverse)) {
            System.out.println(num+" is a Palindrome number");
        }else {
            System.out.println(num+" is not a Palindrome number");
        }
    }
}