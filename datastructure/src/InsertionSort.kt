object InsertionSort {
    var lastIndex = -1;
    lateinit var input: Array<Int>
    fun insertionSort() {     // insertion sort complexity is linear complexity O(n) and it is a stable algorithm
        input = arrayOf(1, 8, 5, 9, 7)
        for (firstUnSortedIndex in 1 until input.size) {
            var newElement = input[firstUnSortedIndex]
            var i = firstUnSortedIndex

            while (i > 0 && input[i - 1] > newElement) {
                input[i] = input[i - 1]
                i--
            }

            input[i] = newElement
        }

        for (i in input) {
            println(i)
        }

    }
}