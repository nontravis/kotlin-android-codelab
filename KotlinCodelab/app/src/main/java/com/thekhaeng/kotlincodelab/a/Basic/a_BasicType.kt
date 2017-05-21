package com.thekhaeng.kotlincodelab.a.Basic

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/18/2017 AD.
 */

class a_BasicType : TryItClass() {

    /** 1. Basic type **/
    val double: Double = 0.0
    val float: Float = 0.0f
    val long: Long = 0L
    val decimal: Int = 0
    val hex: Int = 0x0F // octal is not support.
    val short: Short = 0
    val byte: Byte = 0b00001011
    val str: String = "The Khaeng"
    val trueFalse: Boolean = true
    val listString: List<String> = listOf("The", "Khaeng")

    val immutableVariable: Int = 0 //Note JAVA: final
    var mutableVariable: Int = 0


    /** 2. Underscores in numeric to make number more readable: **/
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


    /** 3. Explicit Conversions **/
    val b: Byte = 1 // OK, literals are checked statically
    val intConvert: Int = b.toInt()
    val shortConvert: Short = b.toShort()
    val longConvert: Long = b.toLong()
    val floatConvert: Float = b.toFloat()
    val doubleConvert: Double = b.toDouble()
    val charConvert: Char = b.toChar()

    /** 4. Conversion **/
    val l = 1L + 3 // Long + Int => Long


    /** 5. Reference equality "===" : ref same object **/
    /**    Structural equality "==" **/
    val int1: Int = 10000  //Note JAVA: int int1 = 10000;
    val int2: Int = 10000  //Note JAVA: int int2 = 10000;
    val int3: Int = int1
    val integer1: Int? = 10000  //Note JAVA: Integer integer1 = new Integer(10000);
    val integer2: Int? = 10000  //Note JAVA: Integer integer2 = new Integer(10000);
    val integer3: Int? = int1 //Note JAVA: Integer integer3 = int1;


    /** 6. Special Char **/
    val supportChar: String = "\t, \b, \n, \r, \', \", \\ and \$. "


    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9') return -1
        return c.toInt() - '0'.toInt() // Explicit conversions to numbers
    }


    /** 7. And or not **/
    val andOrNot: Boolean = true || true && !false


    /** 8. Collections **/
    val numberList1: IntArray = intArrayOf(10, 20, 30, 40, 50)
    val numberList2: List<Int> = listOf(10, 20, 30, 40, 50)
    val map: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")


    /** 9. String Literals **/
    val string1: String = """
    for (c in "foo")
        print(c)
    """
    val string2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()


    /** 10. String template **/
    /** NOTE: like String.format(...) in JAVA **/
    val abc = "abc"
    val stringTemplate = "$abc.length is ${abc.length}"


    //NOTE EXTRA: Kotlin is not Strong type language.
    //NOTE EXTRA: So I recommend you tu put "type" of val/var always it's readable more.
    val noStrongDouble = 0.0
    val strongDouble: Double = 0.0

    val noStrongString = "The Khaeng"
    val strongString: String = "The Khaeng"


    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")
        message += (int1 == int2).toString() + "\n"
        message += (int1 === int2).toString() + "\n"
        message += (int1 === int3).toString() + "\n"

        message += decimalDigitValue('3').toString() + "\n"


        /** 8. Collections **/
        numberList1.forEach {
            message += it
        }

        numberList1.filter { it > 5 }.forEach {
            message += it
        }

        for (number: Int in numberList1) {
            message += number
        }

        message += "\n" + string1
        message += "\n" + string2

        return message
    }

}

