import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f. %n", pi);

        Scanner userScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        Integer userInput = userScanner.nextInt();
        System.out.print(userInput);

    }

}
