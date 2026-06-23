package string

class TwoPointer {

    fun reverseString(s: CharArray): CharArray {
        val arr = ArrayList<Char>()

        for ( i in s.size - 1 downTo 0 ) {
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
            while (left < right && !s[left].isLetterOrDigit()){
                left++

            }
            while (right < s.length - 1 && !s[right].isLetterOrDigit()){
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
}