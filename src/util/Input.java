package util;

import java.util.Scanner;

public class Input {
    private static Scanner scan = new Scanner(System.in);

    public static String getString() {
        return scan.nextLine();
    }

    public static boolean yesNo() {
        String userInput = scan.nextLine();
         return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("true");
    }

    public static int getInt(int min, int max) {
        System.out.printf("Give me a number between %s and %s: ", min, max);
        int userNum = scan.nextInt();
        if(userNum < min || userNum > max) {
            userNum = getInt(min, max);
        }
        return userNum;
    }

    public static int getInt() {
        try {
        return scan.nextInt();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        return scan.nextInt();
    }


    public static double getDouble(double min, double max) {
        System.out.printf("Give me a number between %s and %s: ", min, max);
        double userNum = scan.nextDouble();
        if(userNum < min || userNum > max) {
            userNum = getDouble(min, max);
        }
        return userNum;
    }

    public static double getDouble() {
        try {
        return scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        return scan.nextDouble();
    }

}
