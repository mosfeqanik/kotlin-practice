package com.mosfeqanik.mykotlinapplication.oop

fun main(){
    var a:Int
    myFunctionScope(a=3)
    var oopMain = OopMain()
    var oopMain2 = OopMain("2 Mosfeq","Anik")
    var person1 = OopMain(firstname="3 john",)
    var person2 = OopMain(lastname="Anik")
    var Samsung_Galaxy_S20_Ultra = MobilePhone(osName ="Android" , brand = "Samsung",model="Galaxy S20 Ultra")
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

    ///
class OopMain constructor(firstname:String="1 john",lastname:String="doe"){
init {
    println("name $firstname $lastname")
}
}
///scope and shadowing
fun myFunctionScope(a:Int){
//    a=a
    var b=a
    println("$b")
}