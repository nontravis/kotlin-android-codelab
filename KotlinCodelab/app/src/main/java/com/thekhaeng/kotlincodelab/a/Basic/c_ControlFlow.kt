package com.thekhaeng.kotlincodelab.a.Basic

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/19/2017 AD.
 */
class c_ControlFlow : TryItClass() {

    /** 1. Basic if expression **/
    fun basicIfExpression(): String {
        val a = 10
        val b = 20


        // Traditional usage
        var max: Int = a
        if (a < b) max = b


        return max.toString()
    }

    /** 2. Advance if expression **/
    fun advanceIfExpression(): String {
        val a = 10
        val b = 20

        // As expression
        var max = if (a > b) a else b


        // returning its value or assigning it to a variable
        max = if (a > b) {
            a
        } else {
            b
        }


        return max.toString()
    }


    /** 3. Basic when expression **/
    //NOTE: like switch case in JAVA
    fun basicWhenExpression(): String {
        var message: String = ""

        val x = 0
        when (x) {
            1 -> message += "x == 1\n"
            2 -> message += "x == 2\n"
            else -> message += "x is neither 1 nor 2\n"
        }


        when (x) {
            0, 1 -> message += "x == 0 or x == 1\n"
            else -> message += "otherwise\n"
        }


        val fruits: List<String> = listOf("orange", "apple")
        when {
            "orange" in fruits -> message += "juicy \n"
            "apple" in fruits -> message += "apple is fine too\n"
        }
        return message
    }


    /** 4. Advance when expression **/
    fun advanceWhenExpression(): String {
        var message: String = ""

        val obj: Any = "1" //NOTE: Any like Object class in JAVA
        when (obj) {
            1 -> message += "One\n"
            "Hello" -> message += "Greeting\n"
            is Long -> message += "Long\n"
            !is String -> message += "Not a string\n"
            else -> message += "Unknown\n"
        }


        // can use range
        val x: Int = 9
        when (x) {
            in 1..10 -> message += "x is in the range\n"
            !in 10..20 -> message += "x is outside the range\n"
            else -> message += "none of the above\n"
        }


        // returning its value or assigning it to a variable
        val string = when (obj) {
            is String -> "is String\n"
            else -> "is not String\n"
        }
        message += string


        return message
    }

    /** 5. Basic for loop **/
    fun basicForLoop(): String {
        var message: String = ""
        val numberList: IntArray = intArrayOf(10, 20, 30, 40, 50)

        for (item: Int in numberList) {
            message += item.toString() + " "
        }
        message += "\n"


        for (i in numberList.indices) {
            message += numberList[i].toString() + " "
        }
        message += "\n"


        for ((index, value) in numberList.withIndex()) {
            message += "the element at $index is $value\n"
        }

        return message
    }

    /** 6. Advance for loop **/
    fun advanceForLoop(): String {
        var message: String = ""

        for (x in 1..5) {
            message += x.toString() + " "
        }
        message += "\n"


        for (x in 1..10 step 2) {
            message += x.toString() + " "
        }
        message += "\n"


        for (x in 9 downTo 0 step 3) {
            message += x.toString() + " "
        }
        message += "\n"


        val fruits: List<String> = listOf("orange", "apple")
        fruits.filter { it.startsWith("a") } //NOTE: or fruits.filter {fruit:String -> fruit.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { message += it + "\n" }
        return message
    }

    /** 7. Basic while loop: so easy **/
    fun basicWhileLoop(): String {
        var message: String = ""

        var x: Int = 10
        while (x > 0) {
            message += x.toString() + " "
            x--
        }
        message += "\n"


        var y: Int = 10
        do {
            message += y.toString() + " "
            y--
        } while (y > 0)
        message += "\n"


        return message
    }


    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")
        message += basicWhileLoop()

        return message
    }
}