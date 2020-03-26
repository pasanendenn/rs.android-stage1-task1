package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val list: ArrayList<String> = ArrayList()
        var i = 0
        while (i<inputString.toCharArray().size-1){
            when (inputString[i]){
                '<' -> if (inputString.substring(i+1, inputString.indexOf('>', i+1)).contains('<')){
                    list.add(inputString.substring(i+1, inputString.indexOf('>', inputString.indexOf('>')+1)))
                } else {
                    list.add(inputString.substring(i+1, inputString.indexOf('>', i+1)))
                }


                '(' -> list.add(inputString.substring(i+1, inputString.indexOf(')', i+1)))

                '[' -> list.add(inputString.substring(i+1, inputString.indexOf(']', i+1)))

            }
            i+=1
        }
        return list.toTypedArray()
    }

}
