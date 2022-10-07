import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"Charming", "Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Tasty", "Zealous"};
        String[] nouns = {"Kangaroo", "Penguin", "Lawyer", "Notebook", "Night", "Train", "Ocean", "Iron", "Knife", "Island"};

        String randomAdjective = adjectives[new Random().nextInt(adjectives.length)];
//        System.out.println(randomAdjective);

        String randomNoun = nouns[new Random().nextInt(nouns.length)];
//        System.out.println(randomNoun);

        System.out.printf("Your randomly generated server name is: %s %s", randomAdjective, randomNoun);

    }

}
