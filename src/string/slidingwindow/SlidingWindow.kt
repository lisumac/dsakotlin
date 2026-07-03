package string.slidingwindow

import kotlin.math.max

class SlidingWindow {

    val s = "YazaAay"
    //o/p: aAa

    fun longestNiceSubstring(s: String): String {

        var ans = ""
        var start = 0
        var end = s.length



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

    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        //intArrayOf(1,5,4,2,9,9,9), 3)
        var n = nums.size


        var subarry: ArrayList<Int> = ArrayList()
        var maxSum = Int.MIN_VALUE
        for (i in 0 until n - k + 1) {
            var currentSum = 0
            for (j in 0 until k) {

                print("\ni\n" + nums[i])
                print("\nj\n" + nums[j])
                currentSum = currentSum - nums[i] + nums[j]
                print("currentSum\n" + currentSum)

                maxSum = maxOf(currentSum, maxSum)


            }
            if (subarry.dis)
            return maxSum.toLong()

        }


        fun maxSubarraySum(nums: IntArray, k: Int): Int {
            var n = nums.size


            // Initialize result
            var max_sum = Int.MIN_VALUE

            for (i in 0..<n - k + 1) {
                var current_sum = 0
                for (j in 0..<k) current_sum += nums[i + j]

                // Update result if required.
                max_sum = max(current_sum, max_sum)
            }

            return max_sum

        }


    }
}