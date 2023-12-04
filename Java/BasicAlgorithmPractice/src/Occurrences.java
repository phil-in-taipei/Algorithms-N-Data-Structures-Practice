import java.util.ArrayList;
import java.util.List; // You need to import List from java.util

public class Occurrences {
    private String stringVar;

    private char charVar;

    public Occurrences(String stringVar, char charVar) {
        this.stringVar = stringVar;
        this.charVar = charVar;
    }

    private ArrayList<Character> getStringAsListArrayOfChars(String strToConvert) {
        ArrayList<Character> listOfChars = new ArrayList<Character>();
        for (int i = 0; i < strToConvert.length(); i++) {
            listOfChars.add(strToConvert.charAt(i));
        }
        return listOfChars;
    }

    public String getStringVar() {
        return stringVar;
    }

    public char getCharVar() {
        return charVar;
    }

    public int getNumberOfOccurrences() {
        int numOfOccurrences = 0;
        ArrayList<Character> listOfChars = this.getStringAsListArrayOfChars(this.stringVar);
        for (Character character : listOfChars) {
            if (character == this.charVar) {
                numOfOccurrences++;
            }
        }

        return numOfOccurrences;
    }
}
