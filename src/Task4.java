import java.util.Scanner;

public class Task4 {
    public static void words() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write some words:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        System.out.println("Result:");
        char fLet;


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            fLet = word.charAt(0);
//            System.out.println("Length:" + word.length());
            for(int j = 1; j<word.length(); j++){
//                System.out.println("Index j: " + j);
                if(Character.UnicodeBlock.of(word.charAt(j)) != Character.UnicodeBlock.BASIC_LATIN){
                    System.out.println("\nOnly basic latin characters");
                    break;
                }else if(word.charAt(j) == fLet){
//                    System.out.println("This word " + word + " has letter");
                      word = word.substring(0, j) + word.substring(j+1);
                      j--;
//                    System.out.println("Letter deleted");
                }
            }
//            word = word.substring(0, 0) + word.substring(1);
            System.out.print(word + " ");
        }
        System.out.println();
//        in.close();
    }
}
