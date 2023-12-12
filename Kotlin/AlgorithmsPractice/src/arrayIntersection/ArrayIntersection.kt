package arrayIntersection

class ArrayIntersection(
    val list1: IntArray, val list2: IntArray
) {
    fun getIntersectingValues(): MutableList<Int> {
        var intersectionList: MutableList<Int> = mutableListOf();
        for (i in list1) {
            if (i in list2) {
                intersectionList.add(i);
            }
        }
        return intersectionList
    }
}