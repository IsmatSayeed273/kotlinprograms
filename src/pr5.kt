fun main(){
    var x= readLine()!!.toInt()
    var y= readLine()!!.toInt()
    var i=0
    var result=1

    while(i<y){
        result=result*x
        i++
    }
    println("The value of $x to the power $y is : $result")

}