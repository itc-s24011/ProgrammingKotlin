package chap26

fun main(){
    val p = Person(age = 7)
}
class Person(val name: String, var age: Int) {
    init {
        println("プライマリコンストラクタのイニシャライザが呼ばれました")
        print("指定されたパラメータは $name と $age です。")
    }
    constructor(age: Int) : this("名無しさん",age)
}