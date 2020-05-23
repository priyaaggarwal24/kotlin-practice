package c1

import c1.example.Person

fun main(args: Array<String>) {
    println("Hello, world!~")
    val kevin = Person("Kevin")
    kevin.display()
    kevin.name = "Steven"
    kevin.display()
    kevin.displayWithLambda(::printName)
}

fun printName(s: String) {
    println("Name is $s")
}