///class inheritance
fun main() {
    val bse = BaseSalariedEmployee1(salary = 25000, fName = "Tanvir", lName = "ahamma")
    val hse = HourlySalariedEmployee2(hourlyRate = 250, totalHour = 100, fName = "habib", lName = "ahamma")
    println(bse.salary)
    println(hse.hourlyRate)
    println(hse.totalHour)
    println(bse.getFullName())
    println(hse.getFullName())
    val employees: List<Employees2> = listOf(bse, hse)
    for (employee in employees) {
        println(employee.getFullName())
    }
}

///abstract class
///je class gula object create kora jay na
//abstract class e fun type o thakbe
abstract class Employees2(
    val firstName: String,
    val lastName: String
) {
    abstract fun getFullName(): String
}

//don't use var val inheritance variables
class BaseSalariedEmployee1(
    var salary: Int,
    fName: String, lName: String
) : Employees2(fName, lName) {
    //     fun getFullNameInformation() = "$firstName $lastName draws $salary taka per month"
    override fun getFullName() = "$firstName $lastName draws $salary taka per month"

}

//Runtime Polymorphism
class HourlySalariedEmployee2(var hourlyRate: Int, var totalHour: Int, fName: String, lName: String) :
    Employees2(fName, lName),Allowance {


    override fun getFullName(): String = "$firstName $lastName draws $hourlyRate taka per hour"
    override fun calculateAllowance() {
        TODO("Not yet implemented")
    }
}


//Interface
interface Callback{
    val x:Int
    fun xyz()
}
class X(override val x: Int):Callback{
    override fun xyz() {
        TODO("Not yet implemented")
    }
}

//java ,kotlin, dart akta beshi (multiple) class extent korte pari na
//mutliple class er properties use korar jonno interface korte pari

interface Allowance{

    fun calculateAllowance()
}