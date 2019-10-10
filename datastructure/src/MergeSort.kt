object MergeSort {

    private var numbers: Array<Int>? = null
    private var helper: IntArray? = null
    private var number: Int = 0

    fun sort(values: Array<Int>) {
        this.numbers = values
        number = values.size
        this.helper = IntArray(number)
        mergesort(0, number - 1)
        for (i in numbers!!) {
            println(i)
        }
    }

    private fun mergesort(low: Int, high: Int) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            val middle = low + (high - low) / 2
            // Sort the left side of the array
            mergesort(low, middle)
            // Sort the right side of the array
            mergesort(middle + 1, high)
            // Combine them both
            merge(low, middle, high)
        }
    }

    private fun merge(low: Int, middle: Int, high: Int) {

        // Copy both parts into the helper array
        for (i in low..high) {
            helper!![i] = numbers!![i]
        }

        var i = low
        var j = middle + 1
        var k = low
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper!![i] <= helper!![j]) {
                numbers!![k] = helper!![i]
                i++
            } else {
                numbers!![k] = helper!![j]
                j++
            }
            k++
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers!![k] = helper!![i]
            k++
            i++
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.

    }

}