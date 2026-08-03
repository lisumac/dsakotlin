package string.slidingwindow

import kotlin.math.max

class SlidingWindow {

    val s = "YazaAay"
    //o/p: aAa

    fun longestNiceSubstring(s: String): String {

        var ans = ""
        val start = 0
        val end = s.length



        for (start in s.indices) {
            for (end in start until s.length) {

                val sub = s.substring(start, end + 1)

                if (sub.length > ans.length) {
                    ans = sub
                }
            }
        }

        return ans
    }

    fun maxSubarraySum(array: IntArray, target: Int): Int {
        var sum = 0

        for (index in 0 until target) {
            print("index: ${array[index]}\n")
            sum += array[index]
        }
        var maxsum = sum
        for (i in target until array.size) {
            print("i: ${array[i]}\n")
            print("i>>: ${array[i] - array[i - target]}\n")
            sum += array[i] - array[i - target]
            print("sum: $sum\n")
            maxsum = max(sum, maxsum)

        }
        return maxsum
    }

    fun smallestSubstring(s: String): Int {
        // code here
        var subStrings = ""
        var ans = Int.MAX_VALUE
        for (i in s.indices) {
            subStrings += s[i]
            print("stringlength:1:: ${subStrings.length}\n")
            while (subStrings.contains('1') && subStrings.contains('0') && subStrings.contains('2')) {
                print("stringlength: ${subStrings.length}\n")
                ans = minOf(ans, subStrings.length)

                // Remove only the first character
                subStrings = subStrings.substring(1)
            }
        }
        print("And+ans: $ans\n")
        print("And+ans: ${Int.MAX_VALUE}\n")
        return if (ans == Int.MAX_VALUE) -1 else ans
    }

    fun search(txt: String, pat: String): String {

        val patMap = HashMap<Char, Int>()

        // Frequency of pattern
        for (ch in pat) {
            patMap[ch] = patMap.getOrDefault(ch, 0) + 1
        }

        var window = ""

        for (i in txt.indices) {

            window += txt[i]

            if (window.length > pat.length) {
                window = window.substring(1)
            }

            if (window.length == pat.length) {

                val windowMap = HashMap<Char, Int>()

                for (ch in window) {
                    windowMap[ch] = windowMap.getOrDefault(ch, 0) + 1
                }

                if (windowMap == patMap) {
                    return window
                }
            }
        }

        return ""
    }

    fun countIncreasing(arr: IntArray): Int {
        // code here
        var count = 0
        for (start in arr.indices) {

            for (end in start + 1 until arr.size) {

                if (arr[end] > arr[end - 1]) {
                    count++
                } else {
                    break
                }
            }
        }
        return count
    }

    /**
     * Input: arr[] = [1, 2, 3, 4, 5], x = 11
     * Output: 10
     * Explanation: Subarray having maximum sum is [1, 2, 3, 4].
     */
    fun maxSum(arr: IntArray, target: Int): Int {
        // code here
        var left = 0
        var currentSum = 0
        var maxSum = 0
        for (start in 0 until arr.size - 1) {
            if (arr[start] <= target) {
                currentSum += arr[start]
                print("currentSum: $currentSum\n")
                while (currentSum > target) {
                    currentSum -= arr[left]
                    left++
                }
                maxSum = maxOf(currentSum, maxSum)

            }


        }
        return maxSum
    }

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0.0
        var currentmaximusAvg = 0.0
        var maximusAvg = 0.0
        for (start in 0 until k) {
            //print("nums[start: ${nums[start]}\n")
            sum += nums[start]
            print("currentSum: $sum\n")
            currentmaximusAvg = sum / k
            print("currentmaximusAvg: $currentmaximusAvg\n")
            if (currentmaximusAvg < maximusAvg) {
                sum -= nums[start]
            } else {
                maximusAvg = currentmaximusAvg
            }
        }
        return maximusAvg
    }
}
