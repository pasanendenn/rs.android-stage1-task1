package subtask5
import java.lang.StringBuilder

class HighestPalindrome {
    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val newStr = StringBuilder(digitString)
        val bool = BooleanArray(n)
        var start = 0
        var end = n - 1
        var change = 0

        while (end > start){
            val sub1 = newStr[start]
            val sub2 = newStr[end]
            if (sub1.toInt() > sub2.toInt()){
                newStr[end] = sub1
                bool[start] = true
                change += 1
            } else if (sub1.toInt() < sub2.toInt()){
                newStr[start] = sub2
                bool[start] = true
                change += 1
            }
            start += 1
            end -= 1
        }

        end = n - 1
        start = 0

        var diff = k - change
        if (change > k){
            return "-1"
        } else if (change == k){
            return newStr.toString()
        } else if (change < k){
            while (end >= start){
                if (diff == 0) break
                if ((bool[start] && newStr[start] != '9') || (start == end) && (newStr[start] != '9')){
                    newStr[start] = '9'
                    newStr[end] = '9'
                    diff -= 1
                } else if (!bool[start] && newStr[start] != '9' && diff > 1){
                    newStr[start] = '9'
                    newStr[end] = '9'
                    diff -= 2
                }
                start += 1
                end -= 1
            }
        }
        return newStr.toString()
    }
}
