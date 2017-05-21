package com.thekhaeng.kotlincodelab.c.FuctionsAndLamdas

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class a_Functions : TryItClass() {

    //NOTE: If a function does not return any useful value, its return type is "Unit"

    /** 1. Basic function **/
    fun double(x: Int): Int {
        return x * x
    }


    /**
     * Prefix: + 2 2
     * Postfix: 2 2 +
     * Infix: 2 + 2
     */

    /** 2. Infix notation **/
    class Number(var number: Int = 0) {
        infix fun plus(other: Number): Int {
            return this.number + other.number
        }
    }

    infix fun Int.minus(x: Int): Int {
        return this.minus(x)
    }


    /** 3. Named Arguments **/
    fun reformat(str: String,
                 normalizeCase: Boolean = true,
                 upperCaseFirstLetter: Boolean = true,
                 divideByCamelHumps: Boolean = false,
                 wordSeparator: Char = ' ') {
    }


    /** 4. Unit-returning functions **/
    fun printHello(name: String?): Unit { // or fun printHello(name: String?) {
        if (name != null)
            println("Hello ${name}")
        else
            println("Hi there!")
        // `return Unit` or `return` is optional
    }


    /** 5. Single-Expression functions **/
    fun triple(x: Int): Int = x * 3


    /** 6. Variable number of arguments (Varargs) **/
    // zero or more arguments
    fun asIntList(vararg ts: Int): List<Int> {
        val result = ArrayList<Int>()
        for (t in ts) // ts is an Array
            result.add(t)
        return result
    }


    /** 7. Tail recursive functions **/
    // tailrec modifier and meets the required form, the compiler optimises out the recursion,
    // leaving behind a fast and efficient loop based version instead.
    tailrec fun findFixPoint(x: Double = 1.0): Double
            = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))


    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""


        var num1 = Number(3)
        var num2 = Number(2)
        message += "\n" + (num1 plus num2).toString()
        message += "\n" + (3 minus 1).toString()

        reformat("test") // 1 param
        reformat("test", true) // 2 param
        reformat(str = "test", divideByCamelHumps = true) // Named Arguments

        var list = asIntList()

        message += "\n" + findFixPoint()

        return message
    }
}