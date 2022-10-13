package grocery;

import java.util.Scanner;

public class GroceryApplication {

    public static void main(String[] args) {
        GroceryList userList = new GroceryList();
        System.out.println("Would you like to begin adding items to your grocery list? y/n");
    }

    public void userStart() {
        Scanner scan = new Scanner(System.in);
        String userResponse = scan.nextLine();
        if(userResponse.equalsIgnoreCase("y")) {
            System.out.println("The available categories to add items to are: ");
        }
    }


}
