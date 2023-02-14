import java.util.Scanner;
public class Task4 {
    public static void words() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write some words:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        System.out.println("Result:");

        System.out.print(words[0] + " ");
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            word = word.substring(0, 0) + word.substring(1);
            System.out.print(word + " ");
        }
        System.out.println();
//        in.close();
    }
}