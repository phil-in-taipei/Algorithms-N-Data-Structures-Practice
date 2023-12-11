package fizzbuzz;

import java.util.ArrayList;

public class FizzBuzz {

    private int upUntil;

    public FizzBuzz(int upUntil) {
        this.upUntil = upUntil;
    }

    public ArrayList<String> getFizzbuzz() {
        ArrayList<String> output = new ArrayList<String>();
        int index = 0;
        while (index < this.upUntil) {
            String outputItem = "";
            index++;
            if (index % 3 ==0) {
                outputItem += "fizz";
            }
            if (index % 5 == 0) {
                outputItem += "buzz";
            }
            if (outputItem.isEmpty()) {
                outputItem = Integer.toString(index);
            }
            output.add(outputItem);
        }

        return output;
    }

    public int getUpUntil() {
        return upUntil;
    }


}
