fun main() {
    alternatingSum(8,1,7,3,6,0,4)
}
fun alternatingSum(vararg list: Int){
    var sum=list[0]
    for(i in 1..list.size-1){
        if(i%2!=0){//odd
            sum=sum+list[i]
        }
        else if(i%2==0){// even
            sum=sum-list[i]
        }
    }
    print (sum)
//we can also use toggle function to solve this: if toggle=true ,enter loop do sum or toggle=!toggle(switch ho gya) switch hota rhega or + - hota rhega
}