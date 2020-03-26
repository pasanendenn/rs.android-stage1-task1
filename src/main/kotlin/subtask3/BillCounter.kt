package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val pay = (bill.sum()-bill[k])/2
        val diff = b - pay
        var string= ""

        if (pay == b){
            string = "Bon Appetit"
        } else {
            string = diff.toString()
        }

        return string
    }
}
