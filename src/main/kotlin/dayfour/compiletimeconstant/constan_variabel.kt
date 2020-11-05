package dayfour.compiletimeconstant

object ConstanObject {
    const val BASE_URL = "https"
}
class Constanclass{
    companion object{
        const val BASE_URL = "https://online-course-todo.herokuapp.com"
    }
}
fun main() {
    println(ConstanObject.BASE_URL)
    println(Constanclass.BASE_URL)
}