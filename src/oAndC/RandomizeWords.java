package oAndC;

import java.util.*;



public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = rnd.nextInt(words.length);
            String prevPositionOfPos1 = words[pos1];
            String prevPositionOfPos2 = words[pos2];

            words[pos1] = prevPositionOfPos2;
            words[pos2] = prevPositionOfPos1;
        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
