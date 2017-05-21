package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */


class h_Generics : TryItClass() {

    /** 1. Basic generics **/
    class Box<T>(t: T) {
        var value = t
    }


    /** 2. out modifier **/
    abstract class Source<out T> {
        abstract fun nextT(): T
    }

    class SourceImpl: Source<String>(){
        override
        fun nextT(): String {
            return "next"
        }

    }

    /** 3. in modifier **/
    abstract class Comparable<in T> {
        abstract fun compareTo(other: T): Int
    }

    class StringCompare : kotlin.Comparable<String>{
        override
        fun compareTo(other: String): Int {
            return 0
        }

    }

    // NOTE: learn more https://kotlinlang.org/docs/reference/generics.html

    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        val box1: Box<Int> = Box<Int>(1)

        val box = Box(1) // 1 has type Int, so the compiler figures out that we are talking about Box<Int

        val objects: Source<Any> = SourceImpl() // This is OK, since T is an out-parameter

        return message
    }

}




