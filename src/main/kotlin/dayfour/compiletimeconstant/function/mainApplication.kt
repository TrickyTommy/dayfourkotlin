package dayfour.compiletimeconstant.function

fun main(){
    val result = sumAll(1,2,3,4,5,6)
    println(result)
    ////
    //(1..10) infix

    val parent = Person("parent")
    val child = Person("child")

    parent children child
    print(parent.list.map { it.name })
}

fun sumAll(vararg numbers: Int): Int {

    return numbers.reduce{acc, i -> acc + i}


}

///baru
class Person(val name: String){
    private val _list = mutableListOf<Person>()
    val list get() = _list


    infix fun children(person: Person){
        _list.add(person)
    }

}