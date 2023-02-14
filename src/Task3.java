import java.util.Scanner;

public class Task3 {
    public static void matrixVector() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = scan.nextInt();
        double A[][] = new double[n][n];
        double B[] = new double[n];

        System.out.print("Enter min value of the range: ");
        int min = scan.nextInt();
        System.out.print("Enter max value of the range: ");
        int max = scan.nextInt();

        for(int i = 0; i < n; i++){
            double summ = 0;
            for(int j = 0; j < n; j++){
                A[i][j] = Math.floor(Math.random() * (max - min + 1) + min);
                summ +=A[i][j];
            }
            double aver = summ / n;
            B[i] = aver;
        }

        System.out.println("------------------------------");
        System.out.println("Matrix A:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");
        System.out.println("Vector B:");
        for(int i = 0; i < n; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }
}
