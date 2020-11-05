package dayfour.compiletimeconstant.`object`

interface  FoodProduct{
    val name: String
    val Expire: String
    fun showExpiredTime()

}

class Bread : FoodProduct{
    override val name: String
        get() = TODO("Not yet implemented")
    override val Expire: String
        get() = TODO("Not yet implemented")

    override fun showExpiredTime() {
        TODO("Not yet implemented")
    }

}

fun main(){
    val bread = object : FoodProduct{
        override val name: String
            get() = "Bread"
        override val Expire: String
            get() = "20-08-2020"

        override fun showExpiredTime() {
            print("Expired at : $Expire")
        }

    }
    bread.showExpiredTime()
}