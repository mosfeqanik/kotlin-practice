///class inheritance
fun main() {
    Database.connect()
    Calculator.Constants.pi
}


object Database {
    fun connect() {}
}
class  Calculator{
    companion object Constants{
        val pi = 3.14
        val radain = 0.0174
    }
}

//class er vitor object create korte pari(companion object er maddhome)