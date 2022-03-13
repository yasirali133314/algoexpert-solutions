package easy.twoSum

class TwoSum{
    companion object {
        fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
            var result : List<Int> = listOf<Int>();
            for (i in 0 until array.size) {
                for (j in  i + 1 until array.size) {
                    if(array.elementAt(i) + array.elementAt(j) == targetSum) {
                        print(array.elementAt(i).toString()  + " with "+ array.elementAt(j))
                        return listOf(array.elementAt(i) , array.elementAt(j))
                    }
                }
            }
            return listOf<Int>()
        }
    }
}