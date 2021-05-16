fun main() {
    print("Enter number 1: ")
    var number1: Int = readLine()!!.toInt()
    print("Enter number 2: ")
    var number2: Int = readLine()!!.toInt()

    val number1OriginalValue = number1
    number1 = number2
    number2 = number1OriginalValue

    println("After swapping, number 1 value is $number1 and number 2 value is $number2")
}