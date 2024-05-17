fun sortArray(array: IntArray): IntArray {
    array.sort()
    return array
}

fun main() {
    val numbers = intArrayOf(5, 3, 9, 1, 7)
    val sortedNumbers = sortArray(numbers)
    println("Sorted array: ${sortedNumbers.joinToString()}")
}

fun factorial(n: Int): Long {
    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    val number = 5
    val result = factorial(number)
    println("Factorial of $number is $result")
}

fun hasUniqueCharacters(input: String): Boolean {
    val set = HashSet<Char>()
    for (char in input) {
        if (!set.add(char)) {
            return false
        }
    }
    return true
}

fun main() {
    val string1 = "abcdefg"
    val string2 = "hello"
    
    println("String 1 has unique characters: ${hasUniqueCharacters(string1)}")
    println("String 2 has unique characters: ${hasUniqueCharacters(string2)}")
}
