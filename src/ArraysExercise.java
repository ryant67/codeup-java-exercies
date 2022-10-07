import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] person = {"George", "Jane", "Chris"};

        for(String people : person) {
            System.out.println(people);
        }
    }
}
