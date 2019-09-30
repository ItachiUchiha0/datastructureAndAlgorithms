object SelectionSort {

    lateinit var input :Array<Int>
    fun selectionSort() {
        input =arrayOf(1,8,5,9,7)
        for (lastUnSortedIndex in input.size downTo 1 ) {
            var largest = 0
            for (i in 1 until lastUnSortedIndex) {
                if (input[i] > input[largest]) {
                    largest = i

                }
            }
            swapThem( largest, lastUnSortedIndex-1)
        }

        // the  is O(n) as you iterate two times if you have 10 input you will make 100 operations
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