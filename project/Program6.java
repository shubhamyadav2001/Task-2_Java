public class Program6 {
    // Write a program in Java to print Diamond Pattern.
    public static void main(String[] args) {
        int n = 5;
        diamond(n);
    }

    public static void diamond(int n) {
        for (int i = 1 ; i <= n; i++ ) {

            for (int j = 1 ; j <= n - i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i * 2 - 1; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1 ; i > 0; i-- )
        {
            for (int j = 1 ; j <= n - i; j++ )
            {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i * 2 - 1; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
