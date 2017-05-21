package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class e_ThisExpressions : TryItClass() {

    /** 1. Qualified this **/
    class A {                       // implicit label @A
        inner class B {             // implicit label @B
            fun Int.foo() {         // implicit label @foo
                val a = this@A      // A's this
                val b = this@B      // B's this

                val c = this        // foo()'s receiver, an Int
                val c1 = this@foo   // foo()'s receiver, an Int

                val funLit = lambda@ fun String.() {
                    val d = this    // funLit's receiver
                }

                val funLit2 = { s: String ->
                    // foo()'s receiver, since enclosing lambda expression
                    // doesn't have any receiver
                    val d1 = this
                }
            }
        }
    }


    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""
        return message
    }

}
