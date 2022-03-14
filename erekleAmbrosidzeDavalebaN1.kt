class erekleAmbrosidzeDavalebaN1 {
    fun main() {
        // #1
        val numbers = listOf(1,4,5,2,5)
        println(getAvg(numbers))

        // #2
        val text = "abc"
        print(isPalindrome(text))
    }

    // #1
    private fun getAvg(numbers: List<Int>) : Int {
        var sum = 0
        for (i in 0..numbers.size step 2) {
            sum += numbers[i]
        }
        return sum
    }

    // #2
    private fun isPalindrome(text: String) : Boolean {
        val secondText = text.reversed()
        if(text == secondText) {
            return true
        } else {
            return false
        }
    }
}