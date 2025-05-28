package chap27

open class Car(val color : String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("車が ${d}km 走りました")
        println("マイレージは ${distance}キロになりました")
    }
}
/*

fun main(){
    val car = Car()
    car.drive(5.0)
    car.drive(10.0)
}*/
