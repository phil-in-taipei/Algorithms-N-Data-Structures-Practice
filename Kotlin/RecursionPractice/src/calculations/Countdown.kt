package calculations

class Countdown(private var countDownFrom: Int) {

    fun printCountdown() {
        if (countDownFrom == 0) {
            println("Blast Off!")
            return
        }
        println("The number is: $countDownFrom")
        countDownFrom--
        this.printCountdown()
    }
}