package movies;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

//    public MoviesApplication(String name, String category) {
//        super(name, category);
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - View movies in the animated category");
        System.out.println("3 - View movies in the drama category");
        System.out.println("4 - View movies in the horror category");
        System.out.println("5 - View movies in the sci-fi category");
        System.out.println("");
        System.out.println("Enter the number that corresponds to the option you would like to proceed with: ");
        int userSelection = scan.nextInt();

        if(userSelection == 5) {
            System.out.println();
        }


    }



}
