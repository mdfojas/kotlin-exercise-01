import utils.*

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
    println("Fibonacci sequence up to $number terms: ${fibonacci(number)}")
    println("Is \"$palindrome\" palindrome: ${isPalindrome(palindrome)}")
    println("Sum of digits in $number: ${sumOfDigits(number)}")
    println("GCD of $a and $b: ${gcd(a, b)}")
    println("Number of vowels in \"$str\": ${countVowels(str)}")
    println("$celcius°C in °F: ${celsiusToFahrenheit(celcius)}")
}