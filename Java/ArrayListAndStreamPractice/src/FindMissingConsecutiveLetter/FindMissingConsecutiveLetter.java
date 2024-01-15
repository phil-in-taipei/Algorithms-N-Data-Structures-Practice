package FindMissingConsecutiveLetter;
import java.util.List;

public class FindMissingConsecutiveLetter {
    private final List<Character> arrayOfChars;

    public FindMissingConsecutiveLetter(List<Character> arrayOfChars) {
        this.arrayOfChars = arrayOfChars;
    }
    public Character findMissingLetter() {
        int[] previousCode = {arrayOfChars.get(0)};

        Integer missingCharCode = arrayOfChars.stream()
                .skip(1)
                .map(c -> (int) c)
                .filter(current -> {
                    if (current - previousCode[0] > 1) {
                        return true;
                    }
                    previousCode[0] = current;
                    return false;
                })
                .findFirst()
                .orElse(null);

        return missingCharCode != null ? (char) (missingCharCode - 1) : null;
    }
}
