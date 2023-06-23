///class inheritance
fun main() {
    val bse = BaseSalariedEmployee(salary = 25000, fName = "Tanvir", lName = "ahamma")
    val hse = HourlySalariedEmployee(hourlyRate = 250,totalHour=100, fName = "habib", lName = "ahamma")
    println(bse.salary)
    println(hse.hourlyRate)
    println(hse.totalHour)
    println(bse.getFullName())
    println(hse.getFullName())
    val employees:List<Employees> = listOf(bse,hse)
    for (employee in employees){
        println(employee.getFullName())
    }
}

open class Employees(
    val firstName: String,
    val lastName: String
) {
    open fun getFullName() = "$firstName $lastName"
}

//don't use var val inheritance variables
class BaseSalariedEmployee(
    var salary: Int,
    fName: String, lName: String
) : Employees(fName, lName) {
    //     fun getFullNameInformation() = "$firstName $lastName draws $salary taka per month"
    override fun getFullName() = "$firstName $lastName draws $salary taka per month"

}

//Runtime Polymorphism
class HourlySalariedEmployee(var hourlyRate: Int, var totalHour: Int, fName: String, lName: String) :
    Employees(fName, lName) {
//    override fun getFullName(): String="$firstName $lastName draws $hourlyRate taka per hour"
}