package ArrayListPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListOfIntegers {

    ArrayList<Integer> integers;// = new ArrayList<Integer>();

    public ArrayListOfIntegers(ArrayList<Integer> integers) {
        this.integers = integers;
    }

    public List<Integer> squareListArrayValues() {
        //Function<Integer, Integer> square = x -> x * x;
        return this.integers.stream()
                .map(x -> x * x) // previously used square function (above)
                .collect(Collectors.toList());
    }

    public int getSumOfSquares() {
        return this.squareListArrayValues()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<Integer> getItemsGreaterThanThree() {
        return this.integers
                .stream()
                .filter(i -> i > 3)
                .collect(Collectors.toList());
    }

    public List<Integer> getEvenItems() {
        return this.integers
                .stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }
}
