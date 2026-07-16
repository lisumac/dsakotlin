import string.TwoPointer
import string.slidingwindow.SlidingWindow
import kotlin.math.min

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    val nums = intArrayOf(89, 30, 34, -1,5, 9, 1, 0, 98)
    val numsreverse = intArrayOf(1, 2, 3, 4)
    val reverseString = "android"

//    val palindarome = "madam"
//   println("smalles:: ${smallestNumber(nums)}")
//   println("largest:: ${largestNumber(nums)}")
  // println("revserse:: ${reverseArray(numsreverse)}")
//    println("revserseresult:normal: ${reverseString(reverseString)}")
//   println("revserseresult2::reverseStringTwoPointer:: ${reverseStringTwoPointer(reverseString)}")
//    println("isPalindrome:: ${isPalindromeimproved(palindarome)}")
//    println("checkNonRepeatAlphabet:: ${checkNonRepeatAlphabet(" \"swiss\"\n"
//            )}")

   // println("Integer${digitDividedByTwo(arrayOf(1,2,2,3,4,4))}")
  //  println("Reverse${reverse(123)}")

    //println(convert(4, "1011" ))


   // println("climb${climbStairs(5)}")
   // println("coin${coinChange(intArrayOf(1,5, 10), 11)}")

//    val randomSet = RandomSet()
//
//    println(randomSet.insert(10))
//
//    println(randomSet.insert(20))
//
//    println(randomSet.insert(30))
//
//    randomSet.printData()
//
//    println("Remove 20")
//
//    randomSet.remove(20)
//
//    randomSet.printData()
//
//    println("Random Element: ${randomSet.getRandom()}")


//    val practiceForWalmart = PracticeForWalmart()
//   val s = "()[]{}"
//  //  practiceForWalmart.twoNumsWithN(intArrayOf(2,7,11,15), 9)
//
//   // println("Random Element: ${practiceForWalmart.isValid(s)}")
//    val numsArray = intArrayOf(1,2,3,4,4)
//    val sU = "racecar"
//    val t = "carrace"
//
//   // println("Random Element: ${practiceForWalmart.getConcatenation(numsArray)}")
//    println("Random Element: ${practiceForWalmart.isAnagram(sU, t)}")

val s = charArrayOf('h', 'e', 'l', 'l', 'o')
    val twoPointer = TwoPointer()
   // val result = twoPointer.reverseString(charArrayOf('h','e','l','l','o'))

   // println(result.contentToString())
    //val isTwoPinterPalindrome = twoPointer.isPalindrome("a.")
  //  println("isTwoPinterPalindrome$isTwoPinterPalindrome")

//    val mergeWord = twoPointer.mergeAlternately("abcd", "pq")
//    println("merged string:::::"+mergeWord)

   // val largetString = twoPointer.gcdOfStrings("AAAAAB", "AAA")
   // val validPalindrom = twoPointer.validPalindrome("abca")
    //val validPalindrom = twoPointer.longestPalindrome("babad")
   // println("larget string: $largetString")
   // println("validPalindrom: $validPalindrom")
    val numsArray = intArrayOf(10, 20, 35, 50)
    val  twosum= twoPointer.targetTwoSum(numsArray,70)
    val  twosumarray= twoPointer.twoSum(numsArray,70)
    val  input= intArrayOf(10, 20, 30)
    val  moveZero= twoPointer.moveZeroes(input)
    val duplicateArry= intArrayOf(0,0,1,1,1,2,2,3,3,4)
    val  removeDuplicates= twoPointer.removeDuplicates(duplicateArry)
  //      val  reverseWords= twoPointer.reverseWordsten("Mr Ding")
   // println("removeDuplicates: $reverseWords")

    val arr= intArrayOf(3,2,4)
    val sumTarget= twoPointer.twoSumGeek(arr, target = 6)
    val twoSumHashMap= twoPointer.twoSumHashMap(arr, target = 6)
    println("sumTarget: $sumTarget")
    println("twoSumHashMap: $twoSumHashMap")

    var arrRotate = intArrayOf(7, 9, 1, 3, 5)
    val rotatetarget = 6
    val pairInSortedRotated= twoPointer.pairInSortedRotated(arrRotate, target = rotatetarget)



//    val silding= SlidingWindow()
//    val subarry = silding.longestNiceSubstring("YazaAay")
//    val maximumSubarraySum = silding.maximumSubarraySum(intArrayOf(1,5,4,2,9,9,9), 3)

}

fun largestNumber(nums: IntArray): String {
    var largest = 0

    for (i in nums.indices) {
        if (largest < nums[i]) {
            largest = nums[i]
            println(largest)
        }
    }

    return largest.toString()
}

fun smallestNumber(nums: IntArray): String {
    var smallest = nums[0]
    for (num in nums) {
       // if (num < smallest) {
        if (smallest > num ) {

            smallest = num
        }else{
            println("smallnot"+num)
        }
    }

    return smallest.toString()
}

fun reverseArray(nums: IntArray) {
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
    println(nums.joinToString())
}

fun reverseString(word: String): String {
    var reverseResult = ""
    for (i in word.length - 1 downTo 0) {
        reverseResult += word[i]
    }
    return reverseResult
}
fun reverseStringTwoPointer(wordString: String){
    var start = 0
    val charword= wordString.toCharArray()

    var end = charword.size-1
    while (start < end) {
        val temp = charword[start]
        charword[start] = charword[end]
        charword[end] = temp
        start++
        end--
    }
    println(charword.joinToString().toString())
}

fun isPalindrome(word: String): Boolean{

   var reverseResult=""
    for (i in word.length - 1 downTo 0) {
        reverseResult += word[i]
    }
    println(reverseResult)
    return (reverseResult==word)
}
fun isPalindromeimproved(word: String): Boolean {

    var start = 0
    var end = word.length - 1

    while (start < end) {
        if (word[start] != word[end]) {
            return false
        }
        start++
        end--
    }

    return true
}

//fun checkVowels(word: String): String{
//     val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
//     val charry= word.toCharArray()
//
//    for (i in charry){
//        for (j in vowels){
//            if (charry[i]==vowels[j]){
//
//            }
//                j++
//        }
//        i++
//    }
//}

fun checkNonRepeatAlphabet(str: String): Char? {

    for (i in str.indices) {
        var count = 0

        for (j in str.indices) {
            if (str[i] == str[j]) {
                count++
            }
        }

        if (count == 1) {
            return str[i]
        }
    }

    return null
}
fun firstNonRepeatingChar(str: String): Char? {

    val map = mutableMapOf<Char, Int>()

    // Step 1: Count frequency
    for (ch in str) {
        map[ch] = map.getOrDefault(ch, 0) + 1
    }

    // Step 2: Find first unique
    for (ch in str) {
        if (map[ch] == 1) {
            return ch
        }
    }

    return null
}
//Input: [1,2,2,3,4,4]
//Output: [2,4]
fun digitDividedByTwo(nums: Array<Int>): ArrayList<Int>? {
    val arr = ArrayList<Int>()
    for (i in nums){
        if (i % 2 == 0 &&  !arr.contains(i)){
            arr.add(i)
        }
    }
    return arr
}
//Input: [2,7,11,15], target = 9
//Output: [0,1]
//
//Input: x = 123
//Output: 321
//fun reverse(x: Int): Int {
//
//}

fun climbStairs(n: Int): Int {
    val dp = IntArray(n + 1)

    dp[1] = 1          // step 1 = 1 way
    dp[2] = 2          // step 2 = 2 ways

    for (i in 3..n) {
        println("dp :: ${i}")
        dp[i] = dp[i-1] + dp[i-2]  // current = previous + one before
        println("Next dp ${dp[i]}")
    }

    return dp[n]
}
fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = IntArray(amount + 1) { amount + 1 }

    dp[0] = 0                    // ✅ blank 1

    for (i in 1..amount) {
        for (coin in coins) {
            if (coin <= i) {
                println("coin::${coin}")
                dp[i] = min(dp[i], dp[i - coin] + 1)  // ✅ blank 2, 3
            }
        }
    }

    return if (dp[amount] > amount) -1 else dp[amount]  // ✅ blank 4
}





fun convert(n : Int,  str: String): Int {
    var result = 0;
    for (digit in str){
        result = result * 2 + (digit- '0')
    }
return result
}

fun alphaPattern(n: Int) {

    for (i in 1..n) {

        val ch = 'A' + (i - 1)

        for (j in 1..i) {
            print(ch)
        }

        println()
    }
}
class RandomSet {

    private val list = mutableListOf<Int>()

    private val map = mutableMapOf<Int, Int>()

    fun insert(value: Int): Boolean {

        if (map.containsKey(value)) return false

        list.add(value)

        map[value] = list.lastIndex

        return true
    }

    fun remove(value: Int): Boolean {

        if (!map.containsKey(value)) return false

        val index = map[value]!!

        val lastElement = list.last()

        list[index] = lastElement

        map[lastElement] = index

        list.removeAt(list.lastIndex)

        map.remove(value)

        return true
    }

    fun getRandom(): Int {

        return list.random()
    }

    fun printData() {
        println(list)
        println(map)
    }
}