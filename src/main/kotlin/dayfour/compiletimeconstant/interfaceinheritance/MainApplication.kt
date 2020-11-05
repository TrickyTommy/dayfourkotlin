package dayfour.compiletimeconstant.interfaceinheritance

interface ProductInterface{
    val name: String
}

interface FoodProduct :ProductInterface {
    val expire: String
}

class Television : ProductInterface {
    override val name: String
        get() {
            print("sedang mengambil")

            return "Televison"
        }

}

class Bread : FoodProduct {
    override val name: String
        get() = "06"
    override val expire: String = "bread"
}

fun  main(){
val television= Television()
    val bread: FoodProduct = Bread()

    print(television.name)
    print(bread.name)
    print(bread.expire)
}