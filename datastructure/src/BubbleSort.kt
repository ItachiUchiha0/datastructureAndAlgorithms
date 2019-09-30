object BubbleSort {

     lateinit var input :Array<Int>
    fun bubbleSort() {
        input =arrayOf(1,8,5,9,7)
        for (lastUnSortedIndex in input.size downTo 1 ) {
            for (i in 0 until lastUnSortedIndex-1) {
                if (input[i] > input[i + 1]) {
                    swapThem( i, i + 1)
                }
            }
        }

        // the complexity is O(n) as you iterate two times if you have 10 input you will make 100 operations
        // this algorithm is unstable algorithm

        for (i in input) {
            println(i)
        }
    }

    private fun swapThem( i: Int, j: Int) {
        if (i==j)
            return
        var temp = input[i]
        input[i] = input[j]
        input[j] = temp
    }

}