package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */


class l_Delegation : TryItClass() {


    interface Base {
        fun getXString(): String
    }

    class BaseImpl(val x: String) : Base {
        override
        fun getXString(): String {
            return x
        }
    }

    class Derived(b: Base) : Base by b


    // Other example
    class Derived2 : Base{
        var delegate: Base = BaseImpl("String")

        override
        fun getXString(): String {
            return delegate.getXString()
        }

    }

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        val b = BaseImpl("String")
        message += "\n" + Derived(b).getXString()

        message += "\n" + Derived2().getXString()

        return message
    }

}




