
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Task1 task1 = new Task1();
//        Task2 task2 = new Task2();
//        Task3 task3 = new Task3();
//        Task4 task4 = new Task4();

        while(true){
            System.out.println("------------------------------");
            System.out.println("What task do you want to execute?");
            System.out.println("1. Task 1");
            System.out.println("2. Task 2");
            System.out.println("3. Task 3");
            System.out.println("4. Task 4");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int opt = scan.nextInt();
            System.out.print("\n");

            switch (opt) {
                case 1:
                    Task1.mathProblem();
                    break;
                case 2:
                    Task2.task2();
                    break;
                case 3:
                    Task3.matrixVector();
                    break;
                case 4:
                    Task4.words();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("There is no option for this number \n");
            }
        }

    }
}