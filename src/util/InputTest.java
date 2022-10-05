package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        System.out.println(Input.getDouble());
        System.out.println(Input.getDouble(10.5, 20.8));
        System.out.println(Input.getInt());
        System.out.println(Input.getString());
        System.out.println(Input.yesNo());
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a min: ");
        int min = scan.nextInt();
        System.out.println("Enter a max: ");
        int max = scan.nextInt();
        Input.getInt(min, max);
    }

}
