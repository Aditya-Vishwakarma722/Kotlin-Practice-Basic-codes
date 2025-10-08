package org.example

fun main(){
    print("Enter the Range : ")
    var range = readln().toIntOrNull()?: 10
    var i = 0
    while(i<=range){
        print("$i  ")
        if(i%10 == 0){
            print("\n")
            }
        i++
    }
    println(" ")

    //Sum of the First N Natural Numbers
    var num = 1
    var sum = 0
    while(num<=20){
        sum+=num
        num++
    }
    println("Sum of First 20 Numbers = $sum")

}