package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */

/**
 * Sometimes we need to create an object of a slight modification of some class,
 * without explicitly declaring a new subclass for it.
 * Java handles this case with anonymous inner classes.
 * NOTE: Kotlin slightly generalizes this concept with "object" expressions and object declarations.
 * **/

class k_Objects : TryItClass() {

    /** 1. Basic object **/
    open class A(x: Int) {
        public open val y: Int = x
    }

    interface B { /*...*/ }

    val ab: A = object : A(1), B {
        override val y = 15
    }

    //Note that anonymous objects can be used as types only in local and private declarations.
    // val adHoc = object { // cannot do this
    private val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }

    /** 2. Singleton **/
    object DataProviderManager {
        fun getString(): String {
            return this.javaClass.simpleName
        }
    }


    /** 3. JAVA Static concept **/
    // In kotlin is not static
    // NOTE: so if you want to use "static" property/method needs to be placed inside this companion.
    class MyClass {
        companion object Factory {
            val TAG = MyClass::class.simpleName
            fun create(): MyClass = MyClass()
        }

        object Factory2 { // cannot use like static
            fun create(): MyClass = MyClass()
        }
    }

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        message += "\n" + ab.y
        message += "\n" + adHoc.x

        message += "\n" + DataProviderManager.getString()

        MyClass.create()
        MyClass.TAG
        MyClass.Factory2.create()

        return message
    }

}




