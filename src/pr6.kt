fun main() {
    var myArray= arrayOf(5,8,2,4,6)
    var sum:Int=0
    var i:Int=0

        for (i in 0..4) {
            sum = myArray[i]+sum
        }
        println(sum)
    }

