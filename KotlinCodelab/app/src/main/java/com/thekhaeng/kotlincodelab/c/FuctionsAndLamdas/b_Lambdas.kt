package com.thekhaeng.kotlincodelab.c.FuctionsAndLamdas

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class b_Lambdas : TryItClass() {


    /** 1. Higher-Order Functions: Function argument **/
    fun foo(m: String, function: (m: String) -> String): String {
        return function(m)
    }

    // my function to pass into the other
    fun buz(m: String): String {
        return "another message: $m"
    }


    /** 2. Lambda example **/
    fun implicit(): String {
        val strings: List<String> = arrayListOf("test", "strings", "TheKhaeng")

        val filterString: List<String> =
                strings.filter { it.length > 5 }
                        .sortedBy { it }
                        .map { it.toUpperCase() }

        // or
        val filterString2: List<String> =
                strings.filter { str -> str.length > 5 }
                        .sortedBy { str5Len -> str5Len }
                        .map { sortStr -> sortStr.toUpperCase() }
        return filterString.toString()
    }

    fun <T> max(collection: Collection<T>, less: (T, T) -> Boolean): T? {
        var max: T? = null
        for (it in collection)
            if (max == null || less(max, it))
                max = it
        return max
    }

    /** 3. Function type **/
    val sum = { x: Int, y: Int -> x + y }
    //or
    // val sum: (Int, Int) -> Int = { x, y -> x + y }

    /** 4. Function Literals with Receiver **/
    val add = fun Int.(other: Int): Int = this + other
    //or
    // fun Int.add(other: Int): Int = this + other


    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        message += "\n" + foo("hi", this::buz)
        message += "\n" + implicit()

        val strings: List<String> = arrayListOf("test", "strings", "TheKhaeng")

        message += "\n" + max(strings, { a, b -> a.length < b.length })

        message += "\n" + sum(5, 6)

        message += "\n" + 1.add(2)

        return message
    }
}