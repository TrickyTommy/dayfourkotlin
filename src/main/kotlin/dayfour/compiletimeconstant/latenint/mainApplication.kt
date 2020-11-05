package dayfour.compiletimeconstant.latenint

i
lateinit var app: String //cara tidak baik
var applicationName = ""
fun main(){
    app = "Oh my application"
    applicationName = app

    println(app)
}