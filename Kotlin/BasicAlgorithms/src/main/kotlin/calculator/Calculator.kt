package calculator

class Calculator(
    val num1: Int,
    val num2: Int,
    ) {

    fun add():Int {
        return this.num1 + this.num2;
    }

    fun subtract():Int {
        return this.num1 - this.num2;
    }

    fun divide():Int {
        return this.num1 / this.num2;
    }

    fun multiply():Int {
        return this.num1 * this.num2;
    }
    
}