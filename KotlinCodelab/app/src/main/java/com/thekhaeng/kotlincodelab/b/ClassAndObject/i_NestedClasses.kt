package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */


class i_NestedClasses : TryItClass() {


    /** 1. Nested class **/
    class Outer1 {
        private val bar: Int = 1

        class Nested {
            // fun foo() = bar // cannot do this
            fun foo() = 2
        }
    }

    /** 2. Inner class **/
    /**
     *  A class may be marked as inner to be able to access members of outer class.
     *  Inner classes carry a reference to an object of an outer class:
     */
    class Outer2 {
        private val bar: Int = 1

        inner class Inner {
            fun foo() = bar
        }
    }

    /** 3. Anonymous inner classes **/
    class View{
        interface OnClickTestListener{
            fun onClick()
        }

        var listener: OnClickTestListener? = null
        fun setOnClickListener(listener: OnClickTestListener) {
            this.listener = listener
        }
    }


    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        message += "\n" + Outer1.Nested().foo() // == 2
        message += "\n" + Outer2().Inner().foo() // == 1

        View().setOnClickListener(object : View.OnClickTestListener{
            override
            fun onClick() {
            }
        })

        return message
    }

}




