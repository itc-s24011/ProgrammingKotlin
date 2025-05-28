package chap27

class Ferrari() : Car("赤")

fun main(){
    val car = Ferrari()
    car.drive(5.0)
    car.drive(10.0)
}