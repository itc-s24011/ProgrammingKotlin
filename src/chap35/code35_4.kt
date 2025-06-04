package chap35

class Person(val name: String, val myNumber: Int) {
    override fun equals(other: Any?): Boolean {
        return other != null
                && other is Person
                && this.name == other.name
                && this.myNumber == other.myNumber
    }
}
fun main(){
    val p1 = Person("タケシ",1234)
    val p2 = Person("タケシ",1234)
}