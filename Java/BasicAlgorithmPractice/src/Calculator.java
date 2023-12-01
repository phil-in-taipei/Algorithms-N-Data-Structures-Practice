import java.util.Objects;

public class Calculator {
    private int val1;

    private int val2;

    private String operator;

    public int getVal1() {
        return val1;
    }

    public int getVal2() {
        return val2;
    }

    public String getOperator() {
        return operator;
    }

    public int getOutput() {
        return output;
    }

    private int output;


    public Calculator(int val1, int val2, String operator) throws Exception {
        this.val1 = val1;
        this.val2 = val2;
        this.operator = operator;
        if (Objects.equals(this.operator, "+")) {
            this.output = val1 + val2;
        } else if (Objects.equals(this.operator, "-")) {
            this.output = val1 - val2;
        } else if (Objects.equals(this.operator, "/")) {
            this.output = val1 / val2;
        } else if (Objects.equals(this.operator, "*")) {
            this.output = val1 * val2;
        } else {
            throw new Exception("The operator was invalid!");
        }
    }
}
