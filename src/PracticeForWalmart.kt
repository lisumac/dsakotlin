class PracticeForWalmart {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        for (i in nums) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {

                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    fun twoNumsWithN(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val needed = target - nums[i]
            print(needed)

            if (map.containsKey(needed)) {
                return intArrayOf(map[needed]!!, i)
            }

            map[nums[i]] = i
        }

        return intArrayOf()


    }

    fun isValid(s: String): Boolean {

        val stack = mutableListOf<Char>()

        for (ch in s) {

            if (ch == '(' || ch == '[' || ch == '{') {

                stack.add(ch)

            } else {

                if (stack.isEmpty()) return false

                val last = stack.removeAt(stack.lastIndex)

                if (
                    (last == '(' && ch != ')') ||
                    (last == '[' && ch != ']') ||
                    (last == '{' && ch != '}')
                ) {
                    return false
                }
            }
        }
        print(stack)
        return stack.isEmpty()
    }

    /*
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
*
* */

//    fun singleNonDuplicate(nums: IntArray): Int {
//        var count = 0
//
//        for (i in nums.indices) {
//            if (nums[i] == nums[i + 1]) {
//                count++
//            }e
//
//
//        }
//
//    }
//}

    fun getConcatenation(nums: IntArray): IntArray {


        return nums + nums
    }


    fun hasDuplicate(nums: IntArray): Boolean {
        val hasmap = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            print("message"+nums[i])

            if (hasmap.containsKey(nums[i])) {
              return true
            } else {
                hasmap[nums[i]] = 1
            }

        }
        return false

    }

//    fun isAnagram(s: String, t: String): Boolean {
//        if (s.length != t.length) return false
//        for (c in t) {
//            if (c == s) return true
//        }
//
//    }
}