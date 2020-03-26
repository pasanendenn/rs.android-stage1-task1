package subtask1

class HappyArray {
    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        val list = arrayListOf<Int>()
        val mutableList = list.toMutableList()

        for (item in sadArray) {
            mutableList.add(item)
        }

        var size = mutableList.size
        var size2 = 0

        while(size>size2){
            size = mutableList.size
            for (i in mutableList.indices){
                if (i>0 && i<mutableList.lastIndex){
                    if (mutableList[i]>((mutableList[i-1])+(mutableList[i+1]))){
                        mutableList.removeAt(i)
                    }
                }
            }
            size2 = mutableList.size
        }


        return mutableList.toIntArray()
        //throw NotImplementedError("Not implemented")
    }
}
