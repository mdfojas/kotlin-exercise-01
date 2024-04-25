package utils

fun factorial(n: Int): Long {
    if (n == 0 || n == 1) {
        return 1
    }

    return n * factorial(n - 1)
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }

    for (i in 2..(n / 2)) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}

fun reverseString(str: String): String = str.reversed()

fun findMaxElement(array: Array<Int>): Int? = array.maxOrNull()

fun fibonacci(n: Int): Int? {
    if (n == 0) {
        return null
    }

    if (n == 1) {
        return 0
    }

    val fibonacciSequence = mutableListOf(0, 1)

    for (i in 2..<n) {
        fibonacciSequence.add(fibonacciSequence[i - 1] + fibonacciSequence[i - 2])
    }

    return fibonacciSequence[n-1]
}

fun isPalindrome(str: String): Boolean = str.lowercase() == reverseString(str).lowercase()

fun sumOfDigits(n: Int): Int = n.toString().sumOf { it.toString().toInt() }

fun gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)

fun countVowels(str: String): Int = str.count { it.lowercase() in "aeiou" }

fun celsiusToFahrenheit(celsius: Int): Double = celsius * 9.0 / 5 + 32
