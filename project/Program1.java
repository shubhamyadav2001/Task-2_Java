import java.util.Scanner;

public class Program1 {
    // Write a Java program to perform basic Calculator operations.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        double num2 = sc.nextInt();
        System.out.print("Enter the operation you want to perform : ");
        String operator = sc.next();

        calculator(num1, num2, operator);
    }

    public static void calculator(double num1, double num2, String operator) {

        switch (operator) {

            case "+": {
                double ans = num1+num2;
                System.out.print(num1+" "+operator+" "+num2+" = "+ans);
                break;
            }case "-":{
                double ans = num1-num2;
                System.out.print(num1+" "+operator+" "+num2+" = "+ans);
                break;
            }case "*":{
                double ans = num1*num2;
                System.out.print(num1+" "+operator+" "+num2+" = "+ans);
                break;
            }case "/":{
                double ans = num1/num2;
                System.out.print(num1+" "+operator+" "+num2+" = "+ans);
                break;
            }
            default:{
                System.out.println("Invalid");
                break;
            }
        }
    }

}
