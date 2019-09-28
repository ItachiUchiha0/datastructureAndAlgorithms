object ArraysAsDs {

    fun arrayAsDs(input : Array<Int>){

        println(input[1]) // O(1)  Accessing index is a constant time

        input[1] = 5      // O(1)  updating index is a constant time

        // retrieve all elements is O(1) time constants whatever the length or array
        for (i in input){
            println(i)
        }

        //searching for element in the array is a linear time O(n) as your iterates depending on size
        var index = -1
        for (i in 0 until input.size){
            if (input[i] == 9){
                index = i
                break
            }
        }
        println("the index containing 5 is $index")
    }

}