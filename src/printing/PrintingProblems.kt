package printing

class PrintingProblems {
    //Print "Hello World".
    fun printText() {
        println("Hello World")
    }

    //Print numbers from 1 to 100
    fun printNumbers() {
        for (i in 0..100) {
            print("$i")
        }
    }

    //Print all even numbers from 1 to 100.
    fun printEvenNumbers() {
        for (i in 0..100) {
            if (i % 2 == 0) {
                print("$i\n")
            }
        }
    }

    //Print all odd numbers from 1 to 100
    fun printOddNumbers() {
        for (i in 0..100) {
            if (i % 2 != 0) {
                print("$i\n")
            }
        }
    }
    //Find the sum of first N natural numbers
    //Sum of Natural Numbers

    fun naturalnumberSum(n: Int): Int {
        var sum = 0
        for (i in n downTo 0) {
            sum += i
        }
        return sum
    }

    //Find the factorial of a number.
    fun findFactorial(n: Int): Int {
        var factorial = 1
        for (i in n downTo 1) {
            factorial *= i
        }
        return factorial
    }

    //Check whether a number is prime.
    fun isPrime(n: Int): Boolean {
        var isPrime = false
        // code here

        isPrime = n % 2 == 0


        return isPrime
    }
    //Check whether a number is palindrome

    fun isPalindrome(n: Int): Boolean {
        val original = n
        var temp = n
        var reverse = 0

        if (n < 0) return false

        while (temp > 0) {
            val digit = temp % 10
            reverse = reverse * 10 + digit
            temp = temp / 10
        }

        return original == reverse
    }

    fun reverseDigits(n: Int): Int {
        // Code here

        var temp = n
        var reverse = 0



        while (temp > 0) {
            val digit = temp % 10
            reverse = reverse * 10 + digit
            temp = temp / 10
        }
        return reverse
    }


}