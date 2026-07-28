package kotlindsa


import kotlin.io.print

class KotlinLogicalDSA {

    //a11472o5t6
    //0/p :0 2 1 0 1 1 1 1 0 0

    fun getFrequencyNumber(number: String) {

        var hashMap: HashMap<Char, Int> = HashMap()
        for (i in number) {
            if (i.isDigit()) {
                hashMap[i] = hashMap.getOrDefault(i, 0)+1

            }


        }
        for (digit in '0'..'9') {
            print("${hashMap.getOrDefault(digit, 0)} ")
        }
    }

    fun subString(email: String): Boolean {

        if (email.trim().contains("@")) {
            if (email.trim().substringAfter("@").contains(".")) {
                return true
            }
        }
        return false
    }
}