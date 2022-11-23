
// task 1
fun main1(){
    var arraylist = arrayListOf<Int>(1,2,3,4,5,7)
    var min = arraylist.minOf { item -> item }
    arraylist.replaceAll { arraylist.minOf { item -> item } }
    min = 2
    println(min)
    var max = arraylist.maxOf { item -> item }
    max = 10
    println(max)
}
fun main(){
    var arrnum = ArrayList<Int>()
    arrnum.add(2)
    arrnum.add(10)
    arrnum.addAll(1, listOf(3,4,5,6))

    var avr = arrnum.average()
    println(avr)
}



