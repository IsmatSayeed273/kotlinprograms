fun main() {
    var ans=multi(9,7)
    println(ans)
    print(sum(2,4))
}

//fun with declaration of return type
fun multi(x:Int,y:Int):Int{
    var result=x*y
    return result
}

//fun eith no declaration of return type
fun sum(a:Int,b:Int)=a+b