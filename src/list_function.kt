fun main() {
    var n = readLine()?.toInt()
    if (n != null) {
        for (i in 2..n-1) {
            if(n%i!=0){
                println("$n is  a prime no")
                break
            }

        }
    }
    //println("$n is not a prime no")
}

