///class inheritance
fun main(args: Array<String>) {
    val s1 = StudentInfo(name = "hasssan", roll = 23323)
    val p1 = personInfo(name = "dani", roll = 3223)
    println(s1)
    println(p1)


    val k: Int = 10
    println(k.isOdd())

    StudentInformation().also {
        it.name = "jd"
    }

    StudentInformation().also { student ->
        student.name = "jd"
    }

///apply works as class scope
    StudentInformation().apply {

    }

    val g = StudentInformation().run {
        name = ""
        println("hello")
        true
    }
    println(g)

    val h = StudentInformation().let {
        "hello"
    }
    println(h)

}


////Extension function works with the Build Int Float Double
fun Int.isOdd(): Boolean {
    return this % 2 != 0
}

class StudentInfo(val name: String, val roll: Int) {
    fun getInfo() = ""
    override fun toString(): String {
        return "Student(name='$name',roll=$roll)"
    }
}

data class personInfo(val name: String, val roll: Int)


class StudentInformation() {
    var name: String = "Hassan"
}




//What you know
//If you want a single object from a class, you should use:
//a) Object
//Which method do we use to print an object with meaningful information?
// b) toString()
//Which class do we use only to store a set of data?
//d) Data class
//Which one is True?? (Object Oriented Programming in Kotlin)
//b) Any child class must override the parent class abstract method
//Consider the following class: open class B(val firstName: String, val lastName: String){} Which one is a valid declaration?
// c) class A(fName: String, lName: String) : B(fName, lName)
//Which one is true? (Object Oriented Programming in Kotlin)
// c) Secondary constructor is marked with “constructor”
//Which one is not an OOP concept in Kotlin?
// d) Null Safety
//What you should review
//How many objects can you create from an abstract class?:
// a) None
//Which keyword is used to make a parent class method overridable?
// d) open
//How many classes can be extended from a single class ?
// b) One