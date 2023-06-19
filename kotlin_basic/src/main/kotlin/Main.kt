import java.lang.Exception

fun main(args: Array<String>) {
    var x: Int = 10
    var population: Long = 23342234234234L
    var y: Double = 10.5
    var z: Float = 22.4f
    var status: Boolean = false
    var country: String = "Bangladesh"
    var code: Char = 'A'

    var firstName: String = "Mosfeq"
    var lastName: String = "Anik"


    println("$x")
    println("my name is $firstName $lastName")
    println("Hello World!")


    val a: Int = 10
    val b: Int = 10
//    val sum:Int = a+b
//    print("the sum of $x and $y is $sum")
    println("the sum of $a and $b is ${a + b}")

    val age1: Int = 29
    val age2: Int = 30
    println(age1 > age2)


    val c: Int = 20
    val d: Int = 30
    if (c > d) {
        println("$c is greater than $d")
    } else if (c < d) {
        println("$d is greater than $c")

    } else {
        println("$c is equal to $d")
    }

    val result: String = if (c > d) {
        "$c is greater than $d"
    } else if (c < d) {
        "$d is greater than $c"

    } else {
        "$c is equal to $d"
    }
    println(result)

    val mark = 94
    val newresult = if (mark >= 40 && mark <= 49) {
        "c-"
    } else if (mark >= 50 && mark <= 59) {
        "C+"
    } else if (mark >= 60 && mark <= 69) {
        "B-"
    } else if (mark >= 70 && mark <= 79) {
        "B+"
    } else if (mark >= 80 && mark <= 89) {
        "A-"
    } else if (mark >= 90 && mark <= 100) {
        "A+"
    } else {
        "fail"
    }
    val newresultRange = if (mark in 40..49) {
        "c-"
    } else if (mark in 50..59) {
        "C+"
    } else if (mark in 60..69) {
        "B-"
    } else if (mark in 70..79) {
        "B+"
    } else if (mark in 80..89) {
        "A-"
    } else if (mark in 90..100) {
        "A+"
    } else {
        "fail"
    }
    println(newresult)

//    when(whenresults){
//        0-> println("No results")
//        in  1..39 -> println("Got results")
//        else -> println("Thats a lot of results!")
//    }

    val whenUsageResult = when (mark) {
        in 40..49 -> "C-"
        in 50..59 -> "C+"
        in 60..69 -> "B-"
        in 70..79 -> "B+"
        in 80..89 -> "A"
        in 90..100 -> "A+"
        else -> "F"
    }
    print(whenUsageResult)
    for (element in 1..10) {
        println("I love Bangladesh $element times")
    }

    var bicycles = 0
    while (bicycles < 50) {
        bicycles++
    }
    println("$bicycles bicycles in the bicycle rack\n")
    do {
        bicycles--
    } while (bicycles > 50)
    println("$bicycles bicycles in the bicycle rack\n")


    ///immutatable list listof
    val cities = listOf("Dhaka", "Chittagong", "Rajshahi", "khulna")
    println(cities.get(1))
    println(cities.size)
    for (city in cities) {
        println(city)
    }

    val subCitiesList = cities.subList(fromIndex = 0, toIndex = 2)

    //mutable list
    val mutablecities = arrayListOf("Dhaka", "Chittagong", "Rajshahi", "khulna")
    mutablecities.add("Sylhet")
    mutablecities.add(0, "Barisal")
    println(mutablecities)
    //mutable list
    val mutableArrayofcities = arrayOf("Dhaka", "Chittagong", "Rajshahi", "khulna")
//    mutableArrayofcities.add("Sylhet")
//    mutableArrayofcities.add(0, "Barisal")
    mutableArrayofcities[0] = "Sylhet"
    println(mutableArrayofcities[0])

    val pets = arrayOf("dog", "cat", "canary")
    for (element in pets) {
        println(element + " ")
    }
    for (element in 1..10) {
        println("i love Bangladesh $element times")
    }
    val instruments = listOf("trumpet", "piano", "violin")
    println(instruments)
//    printHello()
//    println(printHellounit("anik"))
//    printHelloArg("anik")
    val sumResult = add2Number(5, 7)
    add2Number2()
    add2Number2(a = 32, b = 12)
    add2Number2(b = 43, a = 12)
    println(sumResult)
    add2Numbercompact(a = 12, b = 89)


    val k: Int = 10
    val f: () -> Unit = {
        println("i am anonymous")
    }
    val g: () -> String = {
        "i am anonymous"
    }
    f()
    f.invoke()
    add2NumberWithAction(a = 10, b = 15, action = { a, b -> a + b })


    repeat(5, {
        println("Repeating $it times")
    })
    repeat(5) { count ->
        println("Repeating $count times")
    }


    var r: Int? = null
//    for null ponter Exception
//    print(r!!.times(4))
//    print(r?.times(4))
    //answer is null
    //elvis operator  ?:
    print(r?.times(4)?:"Operand is Unassigned")
    r = 10
    print(r.times(6))

}

fun printHello() {
    println("hello World")
}

fun printHellounit(name: String?): String {
    return "hi $String!"
}

fun printHelloArg(name: String?) {
    println("hi $String! Arg")
}

fun add2Number(a: Int, b: Int): Int {
    val sum = a + b
    return sum
}

fun add2Number2(a: Int = 1, b: Int = 1) {
    val sum = a + b
    println(sum)
}

//compact function
fun add2Numbercompact(a: Int = 1, b: Int = 1) = println(a + b)

//Higher-order Functions take functions as parameters or return a function
fun add2NumberWithAction(a: Int, b: Int, action: (Int, Int) -> Int) {
    println(action(a, b))
}
//the body of the code calls the function that was passwed as the second argument and passes the first argument along to it.