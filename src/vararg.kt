import kotlin.math.max
//vararg is used to pass the parameters without defining limit of it . I  can pass integer values according to my need
fun main() {
getMax(5,2,4,9,12,22,78)
    job("How to get an internship","Youtube")
    job("How to get an internship")
}

fun getMax(vararg numbers:Int){
var maxNo=numbers.maxOrNull()
    println(maxNo)
}
//google is here treated as default parameter,if no value for resource is passed in the main func then google will be used
fun job(problem:String,resource:String="Google"){
    println("i am searching for $problem in $resource")
}