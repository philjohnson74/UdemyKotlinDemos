fun main() {
    print("Enter a number: ")
    val number1 = readLine()!!.toDouble()
    print("Enter another number: ")
    val number2 = readLine()!!.toDouble()

    val sum = number1 + number2
    println("Sum: $sum")

    val subtract = number1 - number2
    println("Subtract: $subtract")

    val multiply = number1 * number2
    println("Multiply: $multiply")

    val divide = number1 / number2
    println("Divide: $divide")
}