package example.myapp


/*

fun buildAcquarium(){
//    val acq = Acquarium()
//    acq.printSize()
//    println("- - - - - - - - ")
//
//    val acq2 = Acquarium(numOfFish = 28)
//    acq2.printSize()
////    println("Volume: ${acq.breadth * acq2.length * acq2.height / 1000} l")
//
//    acq2.volume = 70
//    acq2.printSize()

    val acq3 = Acquarium(length = 25,breadth = 25,height = 40)
    acq3.printSize()

    val tow1 = TowerTank(diameter = 25,height = 40)
    tow1.printSize()
     
}

fun main(){
    buildAcquarium()
}
*/

// ABSTRACT CLASS

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main(){
    makeFish()

}

