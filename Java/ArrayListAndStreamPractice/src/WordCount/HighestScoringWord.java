package WordCount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestScoringWord {

    String stringOfWords;

    private int getCharScore(char character) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.indexOf(character) + 1;
    }

    public String getHighestScoringWord() {
        ArrayList<String> listOfWords = new ArrayList<>(List.of(stringOfWords.toLowerCase().split(" ")));
        ArrayList<Integer> listOfWordScores = new ArrayList<Integer>();
        listOfWords.forEach((w) -> listOfWordScores.add(getWordScore(w)));
        Integer maxVal = Collections.max(listOfWordScores);
        return listOfWords.get(listOfWordScores.indexOf(maxVal));
    }

    private int getWordScore(String word) {
        return word.chars()
                .map(x -> getCharScore((char) x))
                .reduce(0, Integer::sum);
    }

    public HighestScoringWord(String stringOfWords) {
        this.stringOfWords = stringOfWords;
    }
}
