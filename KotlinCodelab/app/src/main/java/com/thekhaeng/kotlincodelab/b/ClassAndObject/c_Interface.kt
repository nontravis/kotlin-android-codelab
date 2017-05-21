package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class c_Interface : TryItClass() {

    // NOTE: Interfaces in Kotlin are very similar to JAVA 8.
    /** 1. Basic interface **/
    interface MyInterface {
        val prop: Int // abstract

        val propertyWithImplementation: String
            get() = "foo"

        fun foo()

        fun bar() {
            // body
        }
    }

    class Child : MyInterface {

        override val prop: Int = 29

        override
        fun bar() {
            super.bar()
        }

        override
        fun foo() {
        }
    }

    /** 2. Override conflicts **/
    interface A {
        fun foo():String { return "A" }
        fun bar():String
    }

    interface B {
        fun foo():String { return "B" }
        fun bar():String { return "bar" }
    }

    class C : A {
        override fun bar():String { return "bar" }
    }

    class D : A, B {
        override fun foo():String {
//            return super<A>.foo()
          return super<B>.foo()
        }

        override fun bar():String {
            return super<B>.bar()
        }
    }


    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        return message
    }

}
