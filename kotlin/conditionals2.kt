fun determineSeason(month: Int, day: Int): String {
    return when (month) {
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9..11 -> "Autumn"
        12, 1, 2 -> "Winter"
        else -> "Invalid month"
    }
}

fun main() {
    val month = 5
    val day = 20
    val season = determineSeason(month, day)
    println("The season for $month/$day is $season")
}

fun findLargestNumber(num1: Int, num2: Int, num3: Int): Int {
    var max = num1
    if (num2 > max) {
        max = num2
    }
    if (num3 > max) {
        max = num3
    }
    return max
}

fun main() {
    val num1 = 10
    val num2 = 25
    val num3 = 15
    val largest = findLargestNumber(num1, num2, num3)
    println("The largest number is $largest")
}
