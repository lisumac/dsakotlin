package string

import kotlin.math.abs


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
        var isgetTarget = false

        for (i in arry.indices) {

            for (j in i + 1 until arry.size) {
                sum = arry[i] + arry[j]

                if (sum == target) {
                    isgetTarget = true
                }


            }
        }
        return isgetTarget
    }

    fun twoSum(arry: IntArray, target: Int): IntArray {


        for (i in arry.indices) {

            for (j in i + 1 until arry.size) {
                if (arry[i] + arry[j] == target) {
                    return intArrayOf(i + 1, j + 1)
                }


            }
        }


        return intArrayOf()
    }

    fun moveZeroes(nums: IntArray): Unit {
        var index = 0
        val temp = IntArray(nums.size)

        for (i in nums.indices) {
            if (nums[i] != 0) {
                temp[index++] = nums[i]

            }

        }

        for (i in temp.indices) {
            nums[i] = temp[i]
        }


    }

    fun removeDuplicates(nums: IntArray): Int {
        val tempArry = ArrayList<Int>(nums.size)
        tempArry.add(nums[0])
        var index = 0

        for (i in nums.indices) {

            if (tempArry[index] != nums[i]) {
                tempArry.add(nums[i])
                index++
            }
        }

        for (i in tempArry.indices) {
            nums[i] = tempArry[i]
        }
        return tempArry.size

    }

    fun reverseWords(s: String): String {

        val result = StringBuilder()
        var start = 0

        for (i in s.indices) {

            if (s[i] == ' ') {

                for (j in i - 1 downTo start) {
                    result.append(s[j])
                }

                result.append(' ')
                start = i + 1
            }
        }

        // Reverse the last word
        for (i in s.lastIndex downTo start) {
            result.append(s[i])
        }

        return result.toString()
    }

    fun reverseWordsten(s: String): String {
        val chars = s.toCharArray()
        var start = 0
        for (i in chars.indices) {
            print(chars[i] + "\n")
            if (i == chars.lastIndex || chars[i] == ' ') {

                var left = start
                var right = if (chars[i] == ' ') i - 1 else i
                while (left < right) {
                    val temp = chars[left]
                    chars[left] = chars[right]
                    chars[right] = temp
                    left++
                    right--
                }

                start = i + 1
                // print("start${start}\n")
            }
        }
        return String(chars)
    }

    fun twoSumGeek(arr: IntArray, target: Int): Boolean {


        var sum = 0
        val map = HashMap<Int, Int>()
//1, -2, 1, 0, 5 =0

        for (i in arr.indices) {
            print("sum: +arr[i]" + arr[i] + "\n")
            for (j in i + 1 until arr.size) {
                print("sum: +arr[j]" + arr[j] + "\n")
                sum = arr[i] + arr[j]
                print("sum:>> $sum\n")
                if (sum == target) {
                    return true
                }
            }
        }
        return false
    }

    fun twoSumHashMap(nums: IntArray, target: Int): IntArray {


        var sum = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                sum = nums[i] + nums[j]

                if (sum == target) {
                    println("value${nums[i]}${nums[j]} ")
                    return intArrayOf(nums[i], nums[j])
                }
            }
        }
        return intArrayOf()
    }

    fun pairInSortedRotated(arr: IntArray, target: Int): Boolean {

        //Input: arr[] = [7, 9, 1, 3, 5], target = 6
        //Output: true
        //Explanation: arr[2] and arr[4] has sum equals to 6 which is equal to the target.
        if (arr.size < 2) return false
        var sum = 0
        var min = arr[0]
        for (i in 0 until arr.size) {
            if (arr[i] < min) {
                min = arr[i]

            }

        }
        for (i in arr.indices) {
            sum = min + arr[i]
            print("sum>>>: $sum\n")
            if (sum == target) {
                print("pair" + arr[i])
                return true
            }
        }



        return false
    }

    fun pairInSortedRotatedalgo(arr: IntArray, target: Int): Boolean {

        val n = arr.size
        if (n < 2) return false

        // Find pivot (largest element)
        var pivot = 0
        for (i in 0 until n - 1) {
            if (arr[i] > arr[i + 1]) {
                pivot = i
                break
            }
        }

        var left = pivot + 1
        if (left == n) left = 0

        var right = pivot

        while (left != right) {

            val sum = arr[left] + arr[right]

            if (sum == target) {
                return true
            } else if (sum < target) {
                left++
                if (left == n) left = 0
            } else {
                right--
                if (right < 0) right = n - 1
            }
        }

        return false
    }

    fun sumClosest(arr: IntArray?, target: Int): ArrayList<Int?>? {
        var currentSum = 0
        var currentSumDiff = 0
        var minDiff = Int.MAX_VALUE
        val res = ArrayList<Int?>()
        var bestGap = -1

        for (i in arr!!.indices) {
            print("sumClosest: " + arr[i] + "\n")
            for (j in i + 1 until arr.size) {
                print(arr[j])
                currentSum = arr[j] + arr[i]
                currentSumDiff = abs(currentSum - target)
                if (currentSumDiff < minDiff) {
                    minDiff = currentSumDiff
                    res.clear()
                    res.add(arr[j])
                    res.add(arr[i])
                } else if (currentSumDiff == minDiff) {

                    val gap = abs(arr[i] - arr[j])

                    if (gap > bestGap) {
                        bestGap = gap

                        res.clear()
                        res.add(arr[i])
                        res.add(arr[j])
                    }
                }
            }
        }
        return res
        // code here
    }
}


