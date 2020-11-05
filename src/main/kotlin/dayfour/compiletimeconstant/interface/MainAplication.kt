package dayfour.compiletimeconstant.`interface`

interface UserRepository{
    //val name: String = ""//error
    val name: String

    fun getAllUser(){
        println("Getting all user...")
    }
}

class UserRepositoryDatabase : UserRepository{
    override val name: String  get()= "User from Db"
    override fun getAllUser() {
        TODO("Not yet implemented")
    }

}

class UserRepositoryRemote : UserRepository{
    override val name: String get() = "User from Server"
    override fun getAllUser() {

    }

}

fun main(){
    val user: UserRepository = UserRepositoryRemote()
    user.name
    user.getAllUser()
}