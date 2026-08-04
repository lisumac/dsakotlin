package string.slidingwindow

import kotlin.math.abs

class HasMapWithSlidingWindow {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var hashMap= HashMap<Int,Int>()
        for(i in nums.indices){

                if(hashMap.containsKey(nums[i])){

                    val prevHashMap = hashMap[nums[i]]
                    print("previous"+prevHashMap)
                    print("current::${i}\n")

                    if (i - prevHashMap!! <= k){
                        return true
                    }
                }

            hashMap[nums[i]] = i

        }
        return false

    }
}