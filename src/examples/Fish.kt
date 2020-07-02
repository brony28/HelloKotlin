package examples

data class Fish(var name:String)

fun fishExamples(){
    val fish = Fish("splashy")
    with(fish.name) {
        this.capitalize()
        println(this.capitalize()) // the this is implicit and not needed, so you can also remove it.
    }

    fish.run { println(name) }

    val fish2 = Fish("clash").apply { name = "royale" }
    println(fish2.name)

    //run() and apply() are similar, but run() returns the result of applying the function, and apply() returns the object after applying the function.

    println(fish.let { it.name.capitalize() }.let { it+"fish" }.let { it.length }.let { it+31 })
    //In this example, the object type referred to by it is Fish, then String, then String again and finally Int.

    println(fish)

}
//with() is a higher-order function


fun myWith(name:String,block: String.() -> Unit){
    name.block()
}

fun fishExamples2(){
    val fish = Fish("rony benny")
    myWith(fish.name) {
        this.capitalize()
        println(this.capitalize()) // the this is implicit and not needed, so you can also remove it.
    }
}


fun runExample(){
    val runnable = object:Runnable{
        override fun run() {
            println("I'm a Runnable")
        }
    }
    JavaRun.runNow(runnable)
}

fun runExample2() {
//    JavaRun.runNow({
//        println("Passing a lambda as a Runnable")
//    })//You can make this even more concise using the last parameter call syntax, and get rid of the parentheses.
    JavaRun.runNow {
        println("Last parameter is a lambda as a Runnable")
    }
}



fun main(){
    fishExamples()
    fishExamples2()
    runExample()
    runExample2()
}