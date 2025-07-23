fun main() {
    var first = 0
    var second = 1
    var n = readLine()?.toInt()

    if (n != null) {
        for (i in 1..n) {
            var sum= first+second
            //second=next
            sum=second
            println(sum)
        }
    }
}