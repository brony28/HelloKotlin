package example.myapp

import kotlin.math.PI

open class Acquarium(open var length:Int = 100,open var breadth:Int = 20,open var height:Int = 40) {

    fun printSize(){     //method
        println("Length: $length cm "+"Breadth: $breadth cm "
        +"Height: $height cm ")
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")


    }

    init {
        println("Acquarium initializing...")
    }
//    init {
//        println("Volume: ${length*breadth*height/1000} lit")
//    }

    constructor(numOfFish:Int):this(){
        val tankVol = numOfFish*2000*1.1
        height = (tankVol/(length*breadth)).toInt()
    }

    open var volume:Int
        get() = length*breadth*height/1000
     set(value) {
        height = (value*1000)/(breadth*length)
    }

    open val shape = "rectangle"

    open var water:Double = 0.0
        get() = 0.9*volume

}

class TowerTank(override var height: Int,var diameter:Int): Acquarium(height = height,breadth = diameter,length = diameter){
    override var volume: Int
        get() = (breadth/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value*1000/ PI)/(breadth/2 * length/2)).toInt()
        }

    override var water = volume*0.8

    override val shape= "cylinder"

}