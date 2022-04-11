public class Program10 {
    // Write a Java Program to find the Transpose of a given Matrix.
    public static void main(String[] args) {
        int original[][]={{1,4,4},{6,4,3},{2,4,6}};
        int transpose[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=original[j][i];
            }
        }

        System.out.println("Original Matrix :");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("Transpose Matrix :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}