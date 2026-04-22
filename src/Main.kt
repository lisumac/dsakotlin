//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }

    val nums = intArrayOf(3, 30, 34, 5, 9)
    val numsreverse = intArrayOf(1, 2, 3, 4)
    val reverseString = "Android"
    println("smalles:: ${smallestNumber(nums)}")
    println("revserse:: ${reverseArray(numsreverse)}")
    println("revserseresult:: ${reverseString(reverseString)}")


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
        if (num < smallest) {
            smallest = num
            println(smallest)
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
    for (i in word.length - 1 downTo 1) {
        reverseResult += word[i]
    }
    return reverseResult
}