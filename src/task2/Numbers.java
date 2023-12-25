package task2;

import java.util.Arrays;
import java.util.HashSet;

public class Numbers {
    public static void main(String[] args) {
        String first = "1 2 2 1";
        String second = "8 9 5 5";
        String [] splitFirst = first.split(" ");
        String [] splitSecond = second.split(" ");
        HashSet<String> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(splitFirst));
        numbers.addAll(Arrays.asList(splitSecond));
        System.out.println(numbers);
    }
}
