package FunctionalProgrammingEX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int magicNum = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        numbers.removeIf(number -> number % magicNum == 0);

        numbers.forEach(e -> System.out.print(e + " "));
    }
}
