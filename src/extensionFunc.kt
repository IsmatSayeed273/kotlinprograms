//extending function->shorter path
fun main() {
    println("enter the number(n): ")
    var n = readLine()?.toIntOrNull()


    if(n!=null) {
        if (n.isPrime()) {
            println("$n is a prime no")
        } else{ println("$n is not a prime no")
        }
    }
}

fun Int.isPrime():Boolean {
        for (i in 2..this-1) {
            if(this%i==0){
                return false
            }
        }
    return true
}