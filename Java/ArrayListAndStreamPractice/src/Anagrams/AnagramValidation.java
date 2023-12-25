package Anagrams;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AnagramValidation {

    String string1;

    String string2;

    private Map<Character, Long> getFrequencyCount(String string) {
        return string.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    }


    public AnagramValidation(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    private String sortStringAlphabetically(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    public boolean validateByMeansOfStringComparison() {
        return Objects.equals(sortStringAlphabetically(string1), sortStringAlphabetically(string2));
    }

    public boolean validateByMeansOfMapComparison() {
        return Objects.equals(getFrequencyCount(string1), getFrequencyCount(string2));
    }
}
