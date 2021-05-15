fun main(args: Array<String>) {
    val name = "Phil"
    val age = 21

    println("===== User Info =====")
    println("Name: $name")
    println("Age: $age")

    var count = 1
    println("===== Count Info =====")
    println("Count = $count")
    count = 10
    println("Count = $count")

    var department: String?
    department = null
    department = "Engineering"
    println("===== Department Info =====")
    println("Department: ${department!!}")
}