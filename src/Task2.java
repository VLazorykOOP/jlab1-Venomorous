import javax.swing.*;
import java.util.Scanner;

public class Task2 {
    public static void task2(){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        double summa = 0, summa2 = 0;

        System.out.println("This program will create an array A[2n]");
        System.out.print("Enter n: ");
        int n = scan.nextInt();

        System.out.print("Enter min value of the range: ");
        int min = scan.nextInt();
        System.out.print("Enter max value of the range: ");
        int max = scan.nextInt();

        double A[] = new double [2*n];

        for(int i = 0; i < A.length; i++){
            A[i] = Math.floor(Math.random() * (max - min + 1) + min);
            summa += A[i];
            if(i < n) {
                summa2 += A[i];
                count++;
            }
        }

        double aver = summa2/n;
        double summa3 = 0;

        for(int i = n; i < A.length; i++){
            if(A[i]>aver)
                summa3 += A[i];
        }

        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
        System.out.println("Summa(all): " + summa);
        System.out.println("Summa(n - 2n-1): " + summa2);
        System.out.println("Average(n - 2n-1): " + aver);
//        System.out.println("Count(0 - n-1): " + count);
        System.out.println("Summa(>average): " + summa3);
    }
}
