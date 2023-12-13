fun main (args: Array<String>) {
    // definicja tablicy
    var arr = arrayOf(5, 10, 15)
// zastosowanie pętli for w tablicy
    for (i in arr.indices)
    {
    println(i)
    }

    for (i in arr.withIndex())
    {
        println(i)
    }
}

