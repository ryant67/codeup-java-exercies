import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's do some basic math! We're gonna need 2 numbers...");
        System.out.println("What is your first number?");
        int num1 = scan.nextInt();
        System.out.println("What is your second number?");
        int num2 = scan.nextInt();
        System.out.println("Your 2 numbers added equal: " + add(num1, num2));
        System.out.println("Your 2 numbers subtracted equal: " + subtract(num1, num2));
        System.out.println("Your 2 numbers multiplied equal: " + multiply(num1, num2));
        System.out.println("Your 2 numbers divided equal: " + divide(num1, num2));
        System.out.println("The modulus of your 2 numbers is: " + modulus(num1, num2));
        getInteger(1, 10);
        factorial();

        boolean userContinue = false;
        do{
            long factorial = 1;
            int userInput = getInteger(1, 10);
            System.out.printf("Your number is: %d \n", userInput);
            System.out.println("Would you like to continue?");
            String keepGoing = scan.nextLine();
            if(keepGoing.equalsIgnoreCase("y") || keepGoing.equalsIgnoreCase("yes")) {
                userContinue = true;
                for(int i = 1; i <= userInput; i++) {
                    factorial = factorial * i;
                }
            }
        }while (false);

        System.out.println("How many sides would you like your 2 die to have?");
        int sides = scan.nextInt();
        System.out.println("Your random dice roll numbers are: ");

        randomize(sides);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int userInput = scan.nextInt();

        if(userInput >= min && userInput <= max) {
            System.out.println("Awesome, you're within range!");
//            System.exit(0);
        } else {
            System.out.println("Invalid Input, please enter a number between 1 and 10: ");
            getInteger(1, 10);
        }
        return userInput;
    }

    public static void randomize(int sides) {
        System.out.println((int) Math.floor(Math.random() * sides + 1));
        System.out.println((int) Math.floor(Math.random() * sides + 1));
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String willContinue;

        do {
            long userFactorial = 1;
            int userNumber = getInteger(1, 10);
            System.out.printf("You chose %d!\n", userNumber);
            for(int i = 1; i <= userNumber; i++) {
                userFactorial *= i;
            }
            System.out.println(userFactorial);
            System.out.println("Would you like to continue? (yes/no)");
            willContinue = sc.nextLine();
        } while (willContinue.equalsIgnoreCase("yes"));

}}












