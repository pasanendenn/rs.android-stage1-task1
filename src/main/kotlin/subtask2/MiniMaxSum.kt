package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val sum = input.sum()
        val sumArray: IntArray = IntArray(input.size)
        for (i in input.indices){
            sumArray[i] = sum-input[i]
        }

        val min = sumArray.min()
        val max = sumArray.max()

        return intArrayOf(min!!, max!!)

    }
}

