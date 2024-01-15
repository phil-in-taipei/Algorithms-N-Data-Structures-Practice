package calculations;

public class CountDown {

    int countDownFrom;

    public void output() {
        if (this.countDownFrom == 0) {
            System.out.println("Blast Off!");
            return;
        }
        System.out.println("The number is: " + this.countDownFrom);
        this.countDownFrom--;
        this.output();
    }

    public CountDown(int countDownFrom) {
        this.countDownFrom = countDownFrom;
    }
}
