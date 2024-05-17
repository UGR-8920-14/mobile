fun classifyTriangle(side1: Int, side2: Int, side3: Int): String {
    return when {
        side1 == side2 && side2 == side3 -> "Equilateral"
        side1 == side2 || side2 == side3 || side1 == side3 -> "Isosceles"
        else -> "Scalene"
    }
}

fun main() {
    val side1 = 5
    val side2 = 5
    val side3 = 5
    val triangleType = classifyTriangle(side1, side2, side3)
    println("Triangle is $triangleType")
}

fun calculateSalary(hoursWorked: Double, hourlyRate: Double): Double {
    val regularHours = if (hoursWorked <= 40) hoursWorked else 40.0
    val overtimeHours = if (hoursWorked > 40) hoursWorked - 40 else 0.0
    val regularPay = regularHours * hourlyRate
    val overtimePay = overtimeHours * (hourlyRate * 1.5)
    return regularPay + overtimePay
}

fun main() {
    val hoursWorked = 45.0
    val hourlyRate = 20.0
    val totalSalary = calculateSalary(hoursWorked, hourlyRate)
    println("Total Salary: $$totalSalary")
}
