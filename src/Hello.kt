import kotlin.system.measureNanoTime

//fun main(args: Array<String>){
//    println("Hello,  World! Sad Soul")
//}



//p2

//fun main(args: Array<String>){
//    println("Hello,  World! Sad Soul, ${args[0]}")
//}
//A string template inserts a variable or expression into a string, and $ specifies that part of the string will be a variable or expression.
// Curly braces {} frame the expression, if any.

////pt3
//fun main(args: Array<String>) {
//    val unit = println("Hello Ganya Rony!")
//    println(unit)
//}


//pt4

//fun main(args: Array<String>) {
//    val temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)
//}



//pt5

//fun main(args: Array<String>) {
//    val temperature = 10
//    val message = "The H2O temperature is ${if(temperature>50) "Too Garam" else "OkOk he"}"
//    println(message)
//}



//pt6
/*
import java.util.*

fun randomDay() : String{
    val week = arrayOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String{
//    val food : String
//    when(day){
//        "Sunday" -> food="Maggi"
//        "Monday" -> food="Pizza Crumbles"
//        "Tuesday" -> food="Pasta"
//        "Wednesday" -> food="Biscuit Crumbles"
//        "Thursday" -> food="Fries Crumbles"
//        "Friday" -> food="Chinese noodles"
//        "Saturday" -> food="Chicken Biryani"
//        else -> food="nothing"
//    }
//    return food

    return when(day){
        "Sunday" -> "Maggi"
        "Monday" -> "Pizza Crumbles"
        "Tuesday" -> "Pasta"
        "Wednesday" -> "Biscuit Crumbles"
        "Thursday" -> "Fries Crumbles"
        "Friday" -> "Chinese noodles"
        "Saturday" -> "Chicken Biryani"
        else -> "nothing"
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun main(args: Array<String>){
    feedTheFish()
}

*/





//pt7

/*
fun swim(speed: String = "fast"){
    println("swimming $speed")
}

fun main(args: Array<String>){
    swim()
    swim("slow")
    swim(speed = "deep")
}

 */





/*
//pt8
import java.util.*

fun shouldChangeWater(day: String, temperature: Int = 22, dirty:Int = 20): Boolean{
    return when{
        day =="Sunday" -> true
        temperature > 40 -> true
        dirty > 30 -> true
        else -> false
    }
}

fun randomDay() : String{
    val week = arrayOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String{
    return when(day){
        "Sunday" -> "Maggi"
        "Monday" -> "Pizza Crumbles"
        "Tuesday" -> "Pasta"
        "Wednesday" -> "Biscuit Crumbles"
        "Thursday" -> "Fries Crumbles"
        "Friday" -> "Chinese noodles"
        "Saturday" -> "Chicken Biryani"
        else -> "nothing"
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish eat $food")
    println("Change Water: ${shouldChangeWater(day)}")

}

fun main(args: Array<String>){
    feedTheFish()
}


*/



/*
//pt9 : Compact functions
import java.util.*


fun isTooHot(temperature: Int) = temperature > 40
fun isDirty(dirty: Int) = dirty>30
fun isSunday(day: String) = day=="Sunday"

fun shouldChangeWater(day: String, temperature: Int = 22, dirty:Int = 20): Boolean{
    return when{
        isSunday(day) -> true
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        else -> false
    }
}

fun randomDay() : String{
    val week = arrayOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String{
    return when(day){
        "Sunday" -> "Maggi"
        "Monday" -> "Pizza Crumbles"
        "Tuesday" -> "Pasta"
        "Wednesday" -> "Biscuit Crumbles"
        "Thursday" -> "Fries Crumbles"
        "Friday" -> "Chinese noodles"
        "Saturday" -> "Chicken Biryani"
        else -> "nothing"
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish eat $food")
    println("Change Water: ${shouldChangeWater(day)}")

}

fun main(args: Array<String>){
    feedTheFish()
}
*/


//FILTERS


//pt 10


/*
val decorations = listOf("rock","pagoda","plastic plant","alligator","flowerpot")

fun main(args: Array<String>){
    val eager = decorations.filter{it[0] == 'p'}
    println("eager : $eager")


    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("lazy : $filtered")
    val newlazy = filtered.toList()
    println("new lazy : $newlazy")
    println("-----")


    val lazyMap = decorations.asSequence().map {
        println("access : $it")
        it
    }
    println("Lazy Map : $lazyMap")
    println("-----")
    println("1st ele : ${lazyMap.first()}")
    println("-----")
    println("list lazy map : ${lazyMap.toList()}")



    println("======================")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access : $it")
        it
    }
    println("-----")
    println("lazy map2 : ${lazyMap2.toList()}")

}

*/


//LAMBDAs & HIGHER ORDER FUNCT



//Object Oriented Programming













