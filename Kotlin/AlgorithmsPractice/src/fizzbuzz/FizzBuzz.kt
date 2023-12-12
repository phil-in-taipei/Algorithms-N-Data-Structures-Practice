package fizzbuzz

class FizzBuzz(val upUntil: Int) {

    fun getFizzBuzz(): MutableList<Any> {
        var fizzBuzzList: MutableList<Any> = mutableListOf();
        var index: Int = 0;
        while (index < this.upUntil) {
            var stringValue: String = "";
            index++;
            if (index % 3 == 0) {
                stringValue += "fizz"
            }
            if (index % 5 == 0) {
                stringValue += "buzz"
            }
            if (stringValue.isNotEmpty()) {
                fizzBuzzList.add(stringValue)
            } else {
                fizzBuzzList.add(index);
            }
        }
        return fizzBuzzList
    }
}