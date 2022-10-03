package com.mosfeqanik.mykotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickme = findViewById<Button>(R.id.Mybutton)
        val textViewpart = findViewById<TextView>(R.id.textViewpart)
        var counter = 0
//        btnClickme.text ="hahahaha"
        btnClickme.setOnClickListener {
//            counter = counter+1
            counter += 1
            btnClickme.text = "hahahahaha"
            var isSunny: Boolean = true
            isSunny = false
            if (isSunny) btnClickme.text = "hahaha" else btnClickme.text = "d"
            textViewpart.text = counter.toString()

            //character
            val letterchar = 'a'
            val Digitchar = '$'

            //string
            val first_String = "this is the first string"

            val firstStringchar = first_String[0]
            val lastStringchar = first_String[first_String.length - 1]
            val hello_anik = "hello Anik "

            var courseTittleString: String = "Android Masterclass"

            var firstNumberFloat: Float = 13.37F
            var NumberDouble: Double = 3.14159265358979


            var numberForByte: Byte = 25
            var number2ForInt: Short = 2020

            var number3ForInt: Long = 18881234567
            var booleanNameTest: Boolean = true
            var firstchar: Char = 'a'

            var courseName :String = "Android Masterclass"
            val leet : Float = 13.37F
            val pi : Double = 3.14159265358979
            var ageinByte: Byte = 25
            var year : Short = 2020
            var phoneNumber: Long = 18881234567
            var isGood : Boolean = true
            var firstCharacter : Char = 'a'

            var age: Short = 25

//            println(hello_anik + Digitchar)
//            println(hello_anik + first_String)
//            println(hello_anik + firstStringchar)
//            println(hello_anik + lastStringchar)
//            println(hello_anik + "courseTittleString " + courseTittleString)
//            println(hello_anik + "firstNumberFloat " + firstNumberFloat)
//            println(hello_anik + "NumberDouble " + NumberDouble)
//            println(hello_anik + "numberForByte " + numberForByte)
//            println(hello_anik + "number2ForInt " + number2ForInt)
//            println(hello_anik + "number3ForInt " + number3ForInt)
//            println(hello_anik + "booleanNameTest " + booleanNameTest)
//            println(hello_anik + "firstchar " + firstchar)
//            println(hello_anik + "age " + age)

            val a = 5
            val b = 3
            var result:Int = 5/3

            println("anik$a")
            println("anik$b")
            println("anik$result")


            Toast.makeText(applicationContext, "this is toast message", Toast.LENGTH_SHORT).show()
            val toast = Toast.makeText(applicationContext, "Hello Javatpoint", Toast.LENGTH_SHORT)
            toast.show()

            val myToast =
                Toast.makeText(applicationContext, "toast message with gravity", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}