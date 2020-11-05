package dayfour.compiletimeconstant.companion

import dayfour.compiletimeconstant.companion.isValid as isValid


private fun <E> MutableList<E>.swap(first: E, second: E) {
    val firstIndex = this.indexOfFirst { it == first }
    val secondIndex = this.indexOfFirst { it ==second }
    val temp = this[firstIndex]

    this[firstIndex] = this [secondIndex]
    this[secondIndex] = temp
}

object MainApplication
val MainApplication.name: String get() = "Main application"

fun String?.isValid(): Boolean = this != null && isNotEmpty()

class  MainApp{
    companion object
}

val MainApp.Companion.name: String get() ="Main application class"
fun main(){

    val list = mutableListOf("1","2","7")
    list.swap("1", "7")
    print(list)

    var name: String? = null

    if (name.isValid()){
        print(name)
    }else{
        print("opps empty")


    }
    name ="agung"
    if (name.isValid()){
        print(name)
    }else{
        print("opps empty")
    }

    print(MainApplication.name)

}


