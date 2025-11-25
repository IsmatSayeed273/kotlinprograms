
fun OrderSummary( item1: String){
    println("Your single order is 1. $item1")
}
fun OrderSummary( item1: String, item2:String){
    println("Your double order is 1. $item1 and 2.$item2")
}

fun OrderSummary( Item3: String, Item1: String, ammount: Int){

    println("Your have to pay Rs $ammount /-  for  $Item3 and $Item1")
}
fun main(){
    OrderSummary("Watch")  // Your single order is Watch
    OrderSummary("Chips", "Chocolate")  //Your double order is Chips and Chocolate
    OrderSummary("Bracelet")    // Your single order is Bracelet
    OrderSummary("Earring","Jhumka", 200)  //You have to pay Rs 200 /-  for Earring and Jhumka
}

