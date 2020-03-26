package subtask5

import java.lang.StringBuilder

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        val newStr = StringBuilder(digitString)
        var start = 0
        var end = n-1
        var min = 0

        while (end>start){
            val sub1 = newStr[start]
            val sub2 = newStr[end]
            if (sub1.toInt()>sub2.toInt()){
                min+=1
            } else if (sub1.toInt()<sub2.toInt()){
                min+=1
            }
            start += 1
            end -= 1
        }

        start = 0
        end = n-1

        if (k<min) {
            newStr.setLength(2)
            newStr[0] = '-'
            newStr[1] = '1'
        } else if (k==min){
            while (end>start){
                val sub1 = newStr[start]
                val sub2 = newStr[end]
                if (sub1.toInt()>sub2.toInt()){
                    newStr.setCharAt(end, sub1)
                } else if (sub1.toInt()<sub2.toInt()){
                    newStr.setCharAt(start, sub2)
                }
                start += 1
                end -= 1
            }
        } else {
            while (end>start){
                val sub1 = newStr[start]
                val sub2 = newStr[end]
                if (sub1.toInt()>sub2.toInt()){
                    newStr.setCharAt(end, sub1)
                } else if (sub1.toInt()<sub2.toInt()){
                    newStr.setCharAt(start, sub2)
                }
                start += 1
                end -= 1
            }
            newStr.setCharAt(0, '9')
            newStr.setCharAt(n-1, '9')
        }

        return newStr.toString()

    }
    }



