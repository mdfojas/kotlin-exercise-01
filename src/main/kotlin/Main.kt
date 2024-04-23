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

fun fibonacci(n: Int): List<Int> {
    if (n == 0) {
        return emptyList()
    }

    if (n == 1) {
        return mutableListOf(0)
    }

    val fibonacciSequence = mutableListOf(0, 1)

    for (i in 2..<n) {
        fibonacciSequence.add(fibonacciSequence[i - 1] + fibonacciSequence[i - 2])
    }

    return fibonacciSequence
}

fun isPalindrome(str: String): Boolean = str.lowercase() == reverseString(str).lowercase()

fun sumOfDigits(n: Int): Int = n.toString().sumOf { it.toString().toInt() }

fun gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)

fun countVowels(str: String): Int = str.count { it.lowercase() in "aeiou" }

fun celsiusToFahrenheit(celsius: Int): Double = celsius * 9.0 / 5 + 32

fun main () {
    val number = 13
    val str = "HellO"
    val array = arrayOf(0, 9, 5, 6, 1, 7, 8, 8, 3, 5, 0)
    val palindrome = "racecar"
    val a = 0
    val b = 28
    val celcius = 37

    println("Factorial of $number: ${factorial(number)}")
    println("$number is prime: ${isPrime(number)}")
    println("Reverse of $str is: ${reverseString(str)}")
    println("Maximum element in the array: ${findMaxElement(array)}")
    println("Fibonacci sequence up to $number terms: ${fibonacci(1)}")
    println("Is \"$palindrome\" palindrome: ${isPalindrome(palindrome)}")
    println("Sum of digits in $number: ${sumOfDigits(number)}")
    println("GCD of $a and $b: ${gcd(a, b)}")
    println("Number of vowels in \"$str\": ${countVowels(str)}")
    println("$celcius°C in °F: ${celsiusToFahrenheit(celcius)}")
}