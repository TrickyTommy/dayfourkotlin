class PersonModels (){
    var name =""
    constructor(name:String) : this(){
        this.name= name
    }
    fun printName(){
        print(name)
    }

    companion object{
        const val ABILITY = "think"
        //cara lama
        lateinit var temp: PersonModels

        fun getinstance() : PersonModels{
            if(this::temp.isInitialized){
                temp = PersonModels()
            }
            return temp
        }
    }
}
open class PersonModel(private val name: String){
    var age: Int=0

    fun printName() {
        println(name)
    }
}

class AdultModel(name: String) : PersonModel(name){
    init {
        age =23
    }

    fun printPerson(){
        printName()
        print(age)
    }

}