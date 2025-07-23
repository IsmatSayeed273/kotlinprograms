fun main(){
    println("enter your country name")
    var greeting= readLine()?.toString()
    when(greeting){
        "india"-> println("Namaste")
        "pakistan"-> println("Assalam walaikum")
        "japan"-> println("koni chiva")
        "france"-> println("bonjour")


    }
}