import java.util.ArrayList;
import java.util.Arrays;

public class StringRelatedExercises {
    private String stringVar;

    private char charVar;

    public StringRelatedExercises(String stringVar, char charVar) {
        this.stringVar = stringVar;
        this.charVar = charVar;
    }

    public StringRelatedExercises(String stringVar) {
        this.stringVar = stringVar;
    }

    public boolean isAPalindrome() {
        String formattedString = this.stringVar.toLowerCase();
        formattedString = this.removeAllAlphanumericCharacters(formattedString);
        ArrayList<Character> listOfChars = this.getStringAsListArrayOfChars(formattedString);
        for (int i = 0; i < listOfChars.size() / 2; i++) {
            if (listOfChars.get(i) != listOfChars.get(listOfChars.size() - i - 1)) {
                return false;
            }
        }
        return true;
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

    String removeAllSpaces(String string) {
        return string.replaceAll(" ","");
    }

    String removeAllAlphanumericCharacters(String string) {
        return string.replaceAll("[^a-zA-Z0-9]", "");
    }

    public String reverseString() {
        StringBuilder reversedString = new StringBuilder();
        ArrayList<Character> listOfChars = this.getStringAsListArrayOfChars(this.stringVar);
        for (int i = listOfChars.size() - 1; i > 0; i--) {
            reversedString.append(listOfChars.get(i));
        }
        reversedString.setLength(reversedString.length() - 1);
        return reversedString.toString();
    }

    public String titleCase() {
        String[] listOfWordsInString = this.getStringVar().split(" ");
        StringBuilder reformattedString = new StringBuilder();
        for (int i=0; i < listOfWordsInString.length; i++) {
            if (i > 0) {
                reformattedString.append(" ");
            }
            listOfWordsInString[i] =  listOfWordsInString[i].substring(0, 1).toUpperCase()
                    + listOfWordsInString[i].substring(1);
            reformattedString.append(listOfWordsInString[i]);
        }
        return reformattedString.toString();
    }
}
