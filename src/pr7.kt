fun main() {
    println("enter 5 nos :")
    var avg=0.0
    for (i in 1..11) {
        var input = readLine()?.toInt()
        if(input!=null) {
            avg += input / 11.0
        }
    }
    println(avg)
}