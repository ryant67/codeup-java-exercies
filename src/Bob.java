import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        boolean keepGoing;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("What would you like to say to Bob?");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Would you like to keep talking with Bob?");
            String userAnswer = scanner.nextLine();

            if(userAnswer.equalsIgnoreCase("yes")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
        } while (keepGoing);













    }
}
