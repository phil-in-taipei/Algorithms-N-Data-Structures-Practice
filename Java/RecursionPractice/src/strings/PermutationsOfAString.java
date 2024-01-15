package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PermutationsOfAString {

    String string;

    private List<String> createListOfPermutations(String string) {
        List<String> permutations = new ArrayList<String>();
        if (Objects.equals(string, "")) {
            permutations.add(string);
            return permutations;
        }
        for (int i=0; i < string.length(); i++) {
            String currentChar = String.valueOf(string.charAt(i));
            String restOfString = string.substring(0, i) + string.substring(i + 1);
            List<String> subListOfPermutations = this.createListOfPermutations(restOfString);
            for (int j=0; j < subListOfPermutations.size(); j++) {
                permutations.add(currentChar + subListOfPermutations.get(j));
            }
        }
        return permutations;
    }

    public List<String> getListOfPermutations() {
        return this.createListOfPermutations(this.string);
    }

    public PermutationsOfAString(String string) {
        this.string = string;
    }
}
