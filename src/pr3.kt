fun main(){
    var age= readLine()?.toInt()
    if(age!=null){
        if(age<18)
            println("u r very young")

        else if(age>=18 && age<=40)
            println("u r an adult")

        else if (age>40 && age<=80)
            println("very old")
    }
}