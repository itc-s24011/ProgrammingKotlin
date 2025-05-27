package exam03
class Dice(
    val name: String,
    val maxNumber: Int = 6
) {
    var number: Int = 1
        private set
    fun roll() {
        number = (1..maxNumber).random()
    }
}

fun main() {
    val dice = Dice(name = "Standard Dice")
    println("サイコロの名前: ${dice.name}")
    println("最大目: ${dice.maxNumber}")

    dice.roll()
    println("現在の出目: ${dice.number}")

    dice.roll()
    println("再度振った出目: ${dice.number}")
}
