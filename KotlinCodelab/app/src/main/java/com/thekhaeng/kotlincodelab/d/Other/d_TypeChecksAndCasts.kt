package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class d_TypeChecksAndCasts : TryItClass() {


    /** 1. is and !is Operators **/
    fun isOperator(): String {
        val obj = "test"

        if (obj is String) {
            return obj
        } else {
            return "Not a String"
        }
    }


    /** 2. Smart casts **/
    @Suppress("UNREACHABLE_CODE")
    fun smartCasts(): String {
        val x: Any = "test"
        if (x is String) {
            return x.length.toString() // x is automatically cast to String
        } else {
            return "Not a String"
        }

        // or
        if (x !is String) return "Not a String"
        return x.length.toString() // x is automatically cast to String

        // or in the right-hand side of && and ||:
        if (x !is String || x.isEmpty()) return "Not a String"

        //or when-expressions and while-loops
        when (x) {
            is Int -> print(x + 1)
            is String -> print(x.length + 1)
            is IntArray -> print(x.sum())
        }
    }


    /** 3. "Unsafe" cast operator **/
    fun unsafeCast():String{
//        val y: Any = 2
//        val x: String = y as String // not safe it will throw ClassCastException if "y" not String

        val a: Any = 2
        // NOTE: "Safe" (nullable) cast operator
        val b: String? = a as? String // more save if "a" not string it will return "null"

        return b.toString()
    }


    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        message += "\n" + isOperator()

        message += "\n" + smartCasts()

        message += "\n" + unsafeCast()


        return message
    }

}
