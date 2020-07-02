package examples


import kotlin.reflect.full.*

annotation class ImAPlant


@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet


@ImAPlant class Plant{
    fun trim(){}
    fun fertilize(){}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false

}

fun testAnnotations(){
    val classObj = Plant::class
    for (m in classObj.declaredMemberFunctions){
        println(m.name)
    }
}

//finding all annotations in code..
fun testAnnotations2(){
    val plantObject = Plant::class
    for (a in plantObject.annotations){
        println(a.annotationClass.simpleName)
    }
}



fun testAnnotations3(){
    val plantObject = Plant::class
    val myAnnotationObject = plantObject.findAnnotation<ImAPlant>()
    println(myAnnotationObject)
}



fun main(){
    testAnnotations()
    println("-------------")
    testAnnotations2()
    println("-------------")
    testAnnotations3()
}