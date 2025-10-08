package org.example

fun main(){
    print("Enter the Radius Of the Circle : ")
    var radius = readln().toDoubleOrNull() ?: 0.0
    println("Area of the Circle is : ${3.14*radius*radius}")

    print("\nEnter the Length of the Rectangle : ")
    var len = readln().toDoubleOrNull() ?: 0.0
    print("Enter the Breadth of the Rectangle : ")
    var wid = readln().toDoubleOrNull() ?: 0.0
    println("Area of the Rectangle : ${len*wid}")

    print("\nEnter the Side of the Square : ")
    var side = readln().toDoubleOrNull() ?: 0.0
    println("Area of the Square : ${side*side}")

}