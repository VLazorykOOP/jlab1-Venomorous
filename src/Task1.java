import java.util.Scanner;

public class Task1 {
    public static void mathProblem(){

        Scanner scan = new Scanner(System.in);

//        System.out.print("Enter first number: ");
//        double num1 = scan.nextDouble();
//        System.out.print("Enter second number: ");
//        double num2 = scan.nextDouble();
//        System.out.println("\n");
        int aint = 0, bint;
        double ad, bd;

        int resint;
        double resd;
        while (true) {
            System.out.println("------------------------------");
            System.out.println("What type of number should be used?");
            System.out.println("1. Integers");
            System.out.println("2. Double");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int opt = scan.nextInt();
            System.out.print("\n");
            int opt2 = 0;

            switch (opt) {
                case 1:
                    while (opt2 != 3) {
                        System.out.println("------------------------------");
                        System.out.println("What type do you want result to be?");
                        System.out.println("1. Integers");
                        System.out.println("2. Double");
                        System.out.println("3. Back");

                        System.out.print("Choose an option: ");
                        opt2 = scan.nextInt();
                        System.out.print("\n");

                        switch (opt2) {
                            case 1:
                                System.out.print("Enter a: ");
                                if(scan.hasNextInt()) {
                                    aint = scan.nextInt();

                                    System.out.print("\nEnter b: ");
                                    if(scan.hasNextInt()) {
                                    bint = scan.nextInt();

                                    resint = (aint * bint - (aint + bint) * (aint - bint)) / (bint ^ 4 + aint ^ 3) + 5 * bint;
                                    System.out.print("\nResult is: " + resint + "\n");
                                    } else {
                                        scan.next();
                                        System.out.println("\nWrong input!!!");
                                    }

                                }else {
                                    scan.next();
                                    System.out.println("\nWrong input!!!");
                                }
                                break;
                            case 2:
                                System.out.print("Enter a: ");
                                if(scan.hasNextInt()) {
                                    aint = scan.nextInt();

                                    System.out.print("\nEnter b: ");
                                    if(scan.hasNextInt()) {
                                        bint = scan.nextInt();

                                        ad = aint;
                                        bd = bint;

                                        resd = (ad * bd - (ad + bd) * (ad - bd)) / (bd * bd * bd * bd + ad * ad * ad) + 5 * bd;
                                        System.out.print("\nResult is: " + resd + "\n");
                                    } else {
                                        scan.next();
                                        System.out.println("\nWrong input!!!");
                                    }

                                }else {
                                    scan.next();
                                    System.out.println("\nWrong input!!!");
                                }
                                break;
//                            case 3:
//                                System.exit(0);
                            default:
                                System.out.println("There is no option for this number \n");
                        }
                    }
                    break;
                case 2:
                    while (opt2 != 3) {
                        System.out.println("------------------------------");
                        System.out.println("What type do you want result to be?");
                        System.out.println("1. Integers");
                        System.out.println("2. Double");
                        System.out.println("3. Back");

                        System.out.print("Choose an option: ");
                        opt2 = scan.nextInt();
                        System.out.print("\n");

                        switch (opt2) {
                            case 1:
                                System.out.print("Enter a: ");
                                if(scan.hasNextDouble()) {
                                    ad = scan.nextDouble();

                                    System.out.print("\nEnter b: ");
                                    if (scan.hasNextDouble()) {
                                        bd = scan.nextDouble();

                                        resint = (int) ((ad * bd - (ad + bd) * (ad - bd)) / (bd * bd * bd * bd + ad * ad * ad) + 5 * bd);
                                        System.out.print("\nResult is: " + resint + "\n");
                                    } else {
                                        scan.next();
                                        System.out.println("\nWrong input!!!");
                                    }

                                }else {
                                    scan.next();
                                    System.out.println("\nWrong input!!!");
                                }

                                break;
                            case 2:
                                System.out.print("Enter a: ");
                                if(scan.hasNextDouble()) {
                                    ad = scan.nextDouble();

                                    System.out.print("\nEnter b: ");
                                    if (scan.hasNextDouble()) {
                                        bd = scan.nextDouble();

                                        resd = (ad * bd - (ad + bd) * (ad - bd)) / (bd * bd * bd * bd + ad * ad * ad) + 5 * bd;
                                        System.out.print("\nResult is: " + resd + "\n");
                                    } else {
                                        scan.next();
                                        System.out.println("\nWrong input!!!");
                                    }

                                }else {
                                    scan.next();
                                    System.out.println("\nWrong input!!!");
                                }
                                break;
//                            case 3:
//                                System.exit(0);
                            default:
                                System.out.println("There is no option for this number \n");
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("There is no option for this number \n");
            }
        }

    }
}
