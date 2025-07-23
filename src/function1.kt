fun main (){
    printPow(5,3)
    sum(10)
}

//function  for calculating power
fun printPow(x:Int,y:Int){
    var result=1
    if(x!=null&& y!=null ) {
        for (i in 1..y) {
            result+=x
        }
    }
    println("value of $x to the power $y is : $result")
}

//function for calculating sum of 1 to n numbers
fun sum(n:Int){
    var sum=0
    for(i in 1..n){
      sum=sum+i
    }
    println(sum)

}