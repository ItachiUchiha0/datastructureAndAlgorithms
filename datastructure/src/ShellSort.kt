object ShellSort {

    lateinit var input: Array<Int>
    fun shellSort() {
        // shell algorithm is to enhance the time complexity of bubble and insertion sort
        // by decreasing the number of shifting
        // unstable algorithm

        input = arrayOf(1, 8, 5, 9, 7)
        var gap = input.size / 2
        while (gap > 0) {
            for (i in gap until input.size) {
                var newElement = input[i]
                var j = i
                while (j >= gap && input[j - gap] > newElement) {
                    input[j] = input[j - gap]
                    j -= gap
                }
                input[j] = newElement
            }
            gap /= 2
        }

        for (i in input) {
            println(i)
        }
    }
}
