import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Hello " + inputWord("What is your name?"));
//        System.out.println("First element: " + name + "Second element: " + name);
        System.out.println("Well, howdy Mr. " + inputSentence("What is your full name?"));

//        String name = inputWord.next();
//        int age = inputWord.nextInt();
//        double weight = inputWord.nextDouble();
//        System.out.println(name + " is " + age + " years old and weighs " + weight + "kg");
    }

    private static String inputSentence(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message + " ");
        return in.nextLine();
    }

    private static String inputWord(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message + " ");
        return in.next();
    }
}
