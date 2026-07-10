package string

import kotlin.math.max

class TwoPointer {

    fun reverseString(s: CharArray): CharArray {
        val arr = ArrayList<Char>()

        for (i in s.size - 1 downTo 0) {
            arr.add(s[i])
        }
        return arr.toCharArray()
        // Copy back to original array
//    for (i in s.indices) {
//        s[i] = arr[i]
//    }
    }


    fun isPalindrome(s: String): Boolean {

        var left = 0
        var right = s.length - 1
        while (left < right) {
            while (left < right && !s[left].isLetterOrDigit()) {
                left++

            }
            while (right < s.length - 1 && !s[right].isLetterOrDigit()) {
                right--
            }
            if (s[left].lowercaseChar() != s[right].lowercaseChar()) {
                return false
            }

            left++
            right--
        }

        return true

    }

    fun mergeAlternately(word1: String, word2: String): String {
        val stringBuilder = StringBuilder()

        for (i in 0 until maxOf(word1.length, word2.length)) {

            if (i < word1.length) {
                stringBuilder.append(word1[i])
            }
            if (i < word2.length) {
                stringBuilder.append(word2[i])
            }
        }
        return stringBuilder.toString()
    }

    fun gcdOfStrings(str1: String, str2: String): String {
        var largestString: String? = null

        if (str1.length < str2.length) {
            largestString = str1 + str1

            if (largestString.equals(str1)) {
                return str1
            }
        } else if (str2.length < str1.length) {
            print("str2" + str2)
            largestString = str2 + str2
            print("largestString::" + largestString)
            if (largestString.equals(str2)) {
                return str2
            }

        } else {
            largestString = ""
        }
        return largestString
    }

    fun validPalindrome(s: String): Boolean {

        var newString = ""
        var left = 0
        var right = s.length - 1
        while (left < right) {

            if (s[left] == s[right]) {
                left++
                right--
            } else {
                // Remove left character
                val removeLeft = s.substring(0, left) + s.substring(left + 1)

                // Remove right character
                val removeRight = s.substring(0, right) + s.substring(right + 1)

                return isPalindromeTrue(removeLeft) || isPalindromeTrue(removeRight)

            }
        }

        return true


    }

    fun isPalindromeTrue(word: String): Boolean {

        var left = 0
        var right = word.length - 1

        while (left < right) {

            if (word[left] != word[right]) {
                return false
            }

            left++
            right--
        }
        return true
    }


    fun longestPalindrome(s: String): String {

        if (s.length < 2) return s

        var start = 0
        var end = 0

        for (i in s.indices) {

            // Odd length palindrome
            val len1 = expandFromCenter(s, i, i)

            // Even length palindrome
            val len2 = expandFromCenter(s, i, i + 1)

            val maxLength = maxOf(len1, len2)

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2
                end = i + maxLength / 2
            }
        }

        return s.substring(start, end + 1)

    }


    fun expandFromCenter(s: String, left: Int, right: Int): Int {

        var l = left
        var r = right

        while (
            l >= 0 &&
            r < s.length &&
            s[l] == s[r]
        ) {
            l--
            r++
        }

        return r - l - 1
    }

    fun targetTwoSum(arry: IntArray, target: Int): Boolean {
        var sum = 0
        var isgetTarget=false

        for (i in arry.indices) {

            for (j in i+1 until arry.size){
                sum= arry[i] + arry[j ]

                if (sum == target) {
                    isgetTarget = true
                }


            }
        }
        return isgetTarget
    }
    fun twoSum(arry: IntArray, target: Int): IntArray {



        for (i in arry.indices) {

            for (j in i+1 until arry.size){
                if (arry[i] + arry[j] == target) {
                    return intArrayOf(i+1, j+1)
                }


            }
        }


        return intArrayOf()
    }

}


