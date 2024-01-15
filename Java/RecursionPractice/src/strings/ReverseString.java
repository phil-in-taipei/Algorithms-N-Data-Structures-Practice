package strings;

import java.util.Objects;

public class ReverseString {

    String string;

    public String getOutput() {
        if (Objects.equals(string, "")) {
            return string;
        }
        String substring = String.valueOf(string.charAt(0));
        this.string = string.substring(1);
        return this.getOutput() + substring;
    }

    public ReverseString(String string) {
        this.string = string;
    }
}
