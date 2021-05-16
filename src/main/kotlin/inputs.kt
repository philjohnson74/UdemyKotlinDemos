fun main(args: Array<String>) {
    print("Enter user name: ")
    val name: String = readLine()!!.toString()
    print("Enter age: ")
    val age = readLine()!!.toInt()
    print("Enter weight in kilograms: ")
    val weightInKg = readLine()!!.toDouble()

    println("===== User Info =====")
    println("Name: $name")
    println("Age: $age")
    println("Weight in Kilograms: $weightInKg")
}