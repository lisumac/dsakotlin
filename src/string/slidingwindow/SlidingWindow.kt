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

    fun subString(email: String): Boolean {

        if (email.trim().contains("@")) {
            if (email.trim().substringAfter("@").contains(".") ) {
                return true
            }
        }
        return false
    }

}
