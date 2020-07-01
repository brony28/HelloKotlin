package generics

open class WaterSupply(var needsProcessing: Boolean){
}

class TapWater:WaterSupply(true){

    fun addChemicalCleaners(){
        needsProcessing = false
    }
}


class FishStoreWater:WaterSupply(false)

class LakeWater:WaterSupply(true){
    fun filter(){
        needsProcessing = false
    }
}

//make a generic class

//earlier \/
//class Aquarium<T>(val waterSupply: T) // => class Aquarium<T: Any?>(val waterSupply: T)

//now check()\/
//class Aquarium<T: WaterSupply>(val waterSupply: T){
//    fun addWater(){
//        check(!waterSupply.needsProcessing){"water supply needs processing first"}
//        println("adding water from $waterSupply")
//    }
//}

//for IN OUT TYPES
class Aquarium<out T: WaterSupply>(val waterSupply: T){ // out added later
    fun addWater(cleaner: Cleaner<T>){
        if(waterSupply.needsProcessing){
            cleaner.clean((waterSupply))
        }
        println("water added")
    }
}




// for out - inout types
fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")



//for in - inout types
interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner:Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}


fun genericsExample(){
    val aquarium = Aquarium<TapWater>(TapWater()) //When creating the Aquarium object, you can remove the angle brackets and what's between them because Kotlin has type inference. So there's no reason to say TapWater twice when you create the instance. The type can be inferred by the argument to Aquarium; it will still make an Aquarium of type TapWater.
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    ////will work only for 'earlier' version of class
    //val aquarium2 = Aquarium("string") // value not so specific
    //println(aquarium2.waterSupply)

    ////will work only for 'earlier' version of class
    //val aquarium3 = Aquarium(null) //value is null
    //if(aquarium3.waterSupply == null){
    //    println("waterSupply is null")
    //}

    //Why can you pass null when creating an Aquarium? This is possible because by default, T stands for the nullable Any? type, the type at the top of the type hierarchy.



    ////will work for now check()
//    //check()
//    val aquarium4 = Aquarium(LakeWater())
//    //aquarium4.addWater() // will throw an exception warning to process water
//    aquarium4.waterSupply.filter() //after filtering
//    aquarium4.addWater()


    val aquarium5 = Aquarium(TapWater()) //out - inout types
    addItemTo(aquarium5)

    val cleaner = TapWaterCleaner()
    val aquarium6 = Aquarium(TapWater())
    aquarium6.addWater(cleaner)

}





fun main(){
    genericsExample()
}

