//package dayfour.compiletimeconstant.extensionmethod
//
//import dayfour.compiletimeconstant.extensionmethod.isValid as isValid
//
//
//private fun <E> MutableList<E>.swap(first: E, second: E) {
//    val firstIndex = this.indexOfFirst { it == first }
//    val secondIndex = this.indexOfFirst { it ==second }
//    val temp = this[firstIndex]
//
//    this[firstIndex] = this [secondIndex]
//    this[secondIndex] = temp
//}
//
//fun String?.isValid(): Boolean = this != null && isNotEmpty()
//fun main(){
//
//    val list = mutableListOf("1","2","7")
//    list.swap("1", "7")
//    print(list)
//
//    var name: String? = null
//
//    if (dayfour.compiletimeconstant.extensionmethod.isValid()){
//        print(name)
//    }else{
//        print("opps empty")
//
//
//    }
//    name ="agung"
//    if (dayfour.compiletimeconstant.extensionmethod.isValid()){
//        print(name)
//    }else{
//        print("opps empty")
//    }
//
//}
//
//
