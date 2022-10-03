import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's do some basic math! We're gonna need 2 numbers...");
        System.out.println("What is your first number?");
        int num1 = sc.nextInt();
        System.out.println("What is your second number?");
        int num2 = sc.nextInt();
        System.out.println("Your 2 numbers added equal: " + add(num1, num2));
        System.out.println("Your 2 numbers subtracted equal: " + subtract(num1, num2));
        System.out.println("Your 2 numbers multiplied equal: " + multiply(num1, num2));
        System.out.println("Your 2 numbers divided equal: " + divide(num1, num2));
        System.out.println("The modulus of your 2 numbers is: " + modulus(num1, num2));

        getInteger(1, 10);
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

    public static void getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int userInput = scan.nextInt();

        if(userInput >= min && userInput <= max) {
            System.out.println("Awesome, you're within range!");
            System.exit(0);
        } else {
            System.out.println("Invalid Input, please enter a number between 1 and 10: ");
            getInteger(1, 10);
        }
    }

//    public static long factorial(int num) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a number between 1 and 10: ");
//        int userInput = scan.nextInt();
//        int min = 1;
//        int max = 10;
//
//        if(userInput >= min && userInput <= max) {
//            System.out.println("The number you entered: " + userInput + "! has a factorial of ");
//        }
//
//    }














}












