package example.myapp

/*
abstract class AquariumFish{
    abstract val color:String
}

class Shark: AquariumFish(),FishAction {
    override val color = "gray"
    override fun eat(){
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(),FishAction {
    override val color = "gold"
    override fun eat(){
        println("eat algae")
    }
}

interface FishAction{
    fun eat()
}
*/


//INTERFACE DELEGATION
//          ||
//         \  /
//          \/

class Shark: FishAction,FishColor {
    override val color = "gray"
    override fun eat(){
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("eat algae")
        ,FishColor by fishColor{
//    override val color = "gold"

//    override fun eat(){
//        println("eat algae")
//    }
}

interface FishAction{
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}


//Sealed Class

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()


fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}
