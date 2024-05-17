fun main() {
    var sum = 0
    for (i in 2..50 step 2) {
        sum += i
    }
    println("Sum of even numbers from 1 to 50: $sum")
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    var i = 2
    while (i * i <= num) {
        if (num % i == 0) return false
        i++
    }
    return true
}

fun main() {
    val start = 10
    val end = 50
    println("Prime numbers between $start and $end are:")
    var current = start
    while (current <= end) {
        if (isPrime(current)) {
            println(current)
        }
        current++
    }
}

fun isPalindrome(number: Int): Boolean {
    var original = number
    var reverse = 0
    var remainder: Int
    while (original != 0) {
        remainder = original % 10
        reverse = reverse * 10 + remainder
        original /= 10
    }
    return reverse == number
}

fun main() {
    val number = 12321
    if (isPalindrome(number)) {
        println("$number is a palindrome.")
    } else {
        println("$number is not a palindrome.")
    }
}

