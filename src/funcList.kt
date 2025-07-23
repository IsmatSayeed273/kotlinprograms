// program to add list in a func and then search for an item in the list
fun main(){
list()
}
fun list(){
    println("enter the elements u want in list")
    var list= mutableListOf<Int>()
    for (i in 1..6){
        var x= readLine()?.toInt()
        if(x!=null){
            list.add(x)
        }
    }
    println("The list is : $list")
    //search for item
    println("enter the no u r searching ")
    var num= readLine()?.toInt()
    for(item in list){
        if(item==num){
            println("the number $num is at index ${list.indexOf(item)}")
            return
        }

    }
     println("number not found")
}