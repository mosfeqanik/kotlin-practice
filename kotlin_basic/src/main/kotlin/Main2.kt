//class object examples
fun main( ) {
    val s1 = Student()
    println(s1.getFullName())

    val t1 = Teacher()
    println(t1.getFullName())

    val e1 = Employee(firstName = "anik", lastName = "mosfeq")
    println(e1.getFullName())

    val p1 = People(firstName = "Tanvir", lastName = "Ahmad")
    p1.firstName = "syed"
    println(p1.fullName)
}


class Student {
    val firstName: String = "Mosfeq"
    val lastName: String = "Anik"
    fun getFullName() = "$firstName $lastName"
}


class Teacher {
    val firstName: String
    val lastName: String

    init {
        firstName = "tanvir"
        lastName = "Ahmed"
    }

    fun getFullName() = "$firstName $lastName"
}

class Employee(
    val firstName: String,
    val lastName: String
) {
    fun getFullName() = "$firstName $lastName"
}

class People(
    var firstName: String,
    val lastName: String
) {
    var fullName: String = ""
        get() {
            return "$firstName $lastName"
        }
        set(value) {
            field = value
        }
}

//class constructor example
