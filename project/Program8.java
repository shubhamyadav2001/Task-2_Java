import java.util.Scanner;

public class Program8 {
    // Write a Java Program to check whether the given array is Mirror Inverse or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array : ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(mirror(arr)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static boolean mirror(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }
}