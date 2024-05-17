import java.time.LocalTime

fun main() {
    val currentTime: String = LocalTime.now().toString()
    val temperature: Double = 25.5 // Replace this with the actual temperature
    val grade: Char = 'A' // Replace this with the actual grade
    println("Current Time: $currentTime")
    println("Temperature: $temperature")
    println("Grade: $grade")
}
