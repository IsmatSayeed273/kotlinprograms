fun main(){
    println("enter your name")
    var name= readln()
    var newName=name.reversed()

    if(name==newName){
        println(" $name is a palindrome")
    }
    else println("$name is not palindrome")

    //print(" my string is ${name.uppercase().reversed()}")

}