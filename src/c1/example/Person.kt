package c1.example

class Person(var name: String) {
    fun display() {
        println("Name is $name")
    }

    fun displayWithLambda(func: (s:String) -> Unit) {
        func(name)
    }
}