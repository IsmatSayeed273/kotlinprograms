fun main() {
multi(2,4,5,1,3,7)
}
fun multi(vararg List: Int){
    var multi=1
    for(item in List){
        multi=multi*item
    }
    println("product of the list ${list()} is $multi")

}