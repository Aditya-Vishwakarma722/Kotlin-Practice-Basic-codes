package org.example

fun main(){
    print("Enter a Number : ")
    var num = readln().toIntOrNull()?: 1
    val original = num

    var product = 1
    while(num!=1){
        if(num == 0 || num == 1){
            print("1")
        }
        else{
            product*=num
            num--
        }
    }
    print("Factorial of $original : $product")
}