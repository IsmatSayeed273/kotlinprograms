fun main(){
    var myList= mutableListOf<Int>()

    for (i in 1..5) {
        var x= readLine()?.toInt()
        if (x != null) {
            myList.add(x)
        }

    }
    println(myList.reversed())



}