package string.slidingwindow

import kotlin.math.abs

class HasMapWithSlidingWindow {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var hashMap = HashMap<Int, Int>()
        for (i in nums.indices) {

            if (hashMap.containsKey(nums[i])) {

                val prevHashMap = hashMap[nums[i]]
                print("previous" + prevHashMap)
                print("current::${i}\n")

                if (i - prevHashMap!! <= k) {
                    return true
                }
            }

            hashMap[nums[i]] = i

        }
        return false

    }

    fun findLHS(nums: IntArray) : Int{
        var frequency = HashMap<Int, Int>()
        var ans = 0
        for (i in nums.indices) {
            frequency[nums[i]] = frequency.getOrDefault(nums[i], 0) + 1
        }

        for ((key, value) in frequency) {
            print("$key->$value\n")
            if (frequency.containsKey(key + 1)){
                val length = value + frequency[key + 1]!!
                ans = maxOf(ans, length)
            }
        }
        return ans
    }
}