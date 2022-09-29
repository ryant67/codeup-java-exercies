import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

////////////////////////////////////////////////////////Exercise 1A: While Loop
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
////////////////////////////////////////////////////////Exercise 1A: For Loop
//        for(int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
////////////////////////////////////////////////////////Exercise 1B(1): Do/While Loop
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
////////////////////////////////////////////////////////Exercise 1B(2): Do/While Loop
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
////////////////////////////////////////////////////////Exercise 1B(3): Do/While Loop
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);
////////////////////////////////////////////////////////Exercise 1B(1): For Loop
//        for(int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
////////////////////////////////////////////////////////Exercise 1B(2): For Loop
//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
////////////////////////////////////////////////////////Exercise 1B(3): For Loop
//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }
////////////////////////////////////////////////////////Exercise 2: FizzBuzz
//        for(int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
////////////////////////////////////////////////////////Exercise 3: Table of Powers
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing;
//        do {
//            System.out.println("Enter a Number: ");
//            int userNum = scanner.nextInt();
//
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------------------------");
//
//
//            for (int i = 1; i <= userNum; i++) {
//                System.out.printf("%d | %d | %d%n", i, i * i, i * i * i);
//            }
//            scanner.nextLine();
//            System.out.println("Would you like to do more Math?");
//            String userAnswer = scanner.nextLine();
//
//            if (userAnswer.equalsIgnoreCase("yes")) {
//                keepGoing = true;
//            } else {
//                keepGoing = false;
//            }
//        } while (keepGoing);
////////////////////////////////////////////////////////Exercise 4: Grade Check
//         do {
//             System.out.println("Enter your Numbered Grade: ");
//             int userNum = scanner.nextInt();
//
//             if(userNum >= 88 && userNum <= 100) {
//                 System.out.println("You Got An A!");
//             } else if (userNum <= 87 && userNum >= 80) {
//                 System.out.println("You Got A B!");
//             } else if (userNum <= 79 && userNum >= 67) {
//                 System.out.println("You Got A C!");
//             } else if (userNum <= 66 && userNum >= 60) {
//                 System.out.println("You Got A D!");
//             } else {
//                 System.out.println("You Got An F!");
//             }
//
//             scanner.nextLine();
//             System.out.println("Would you like to look at another grade?");
//             String userAnswer = scanner.nextLine();
//             if (userAnswer.equalsIgnoreCase("yes")) {
//                 keepGoing = true;
//             } else {
//                 keepGoing = false;
//             }
//         } while (keepGoing);


    }
}
