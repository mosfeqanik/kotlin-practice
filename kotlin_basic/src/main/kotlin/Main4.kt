///class inheritance
fun main() {
    val bse = BaseSalariedEmployee2(salary = 25000, fName = "Tanvir", lName = "ahamma")
    val hse = HourlySalariedEmployee3(hourlyRate = 250, totalHour = 100, fName = "habib", lName = "ahamma")
    println(bse.salary)
    println(hse.hourlyRate)
    println(hse.totalHour)
    println(bse.getFullName())
    println(hse.getFullName())
    val employees: List<Employees1> = listOf(bse, hse)
    for (employee in employees) {
        println(employee.getFullName())
    }
    ////anonymous object
    val a:A = object :A(){
        override fun something(): Unit {
           println("hello")
        }
    }

}

///abstract class
///je class gula object create kora jay na
//abstract class e fun type o thakbe
abstract class Employees1(
    val firstName: String,
    val lastName: String
) {
    abstract fun getFullName(): String
}

//don't use var val inheritance variables
class BaseSalariedEmployee2(
    var salary: Int,
    fName: String, lName: String
) : Employees1(fName, lName) {
    //     fun getFullNameInformation() = "$firstName $lastName draws $salary taka per month"
    override fun getFullName() = "$firstName $lastName draws $salary taka per month"

}

//Runtime Polymorphism
class HourlySalariedEmployee3(var hourlyRate: Int, var totalHour: Int, fName: String, lName: String) :
    Employees1(fName, lName) {
    override fun getFullName(): String = "$firstName $lastName draws $hourlyRate taka per hour"
}

abstract class A {
    abstract fun something(): Unit
    fun aa() = 23
}