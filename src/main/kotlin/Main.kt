
// task 1
fun main(){
    var arraylist = arrayListOf<Int>(1,2,3,4,5,7)
    var min = arraylist.minOf { item -> item }
    arraylist.replaceAll { arraylist.minOf { item -> item } }
    min = 2
    println(min)
    var max = arraylist.maxOf { item -> item }
    max = 10
    println(max)
}



