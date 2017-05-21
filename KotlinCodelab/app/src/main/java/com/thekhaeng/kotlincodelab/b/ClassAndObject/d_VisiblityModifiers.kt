package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class d_VisiblityModifiers : TryItClass() {

    /**
    * NOTE: For members declared inside a class:
    *   private - visible inside this class only (including all its members);
    *   protected — same as private + visible in subclasses too;
    *   internal — any client inside this module who sees the declaring class sees its internal members;
    *   public — any client who sees the declaring class sees its public members.
    **/

    open class Outer {
        private val a = 1
        protected open val b = 2
        internal val c = 3
        val d = 4  // public by default

        protected class Nested {
            public val e: Int = 5
        }
    }

    class Subclass : Outer() {
        // a is not visible
        // b, c and d are visible
        // Nested and e are visible

        override val b = 5   // 'b' is protected
    }

    class Unrelated(o: Outer) {
        // o.a, o.b are not visible
        // o.c and o.d are visible (same module)
        // Outer.Nested is not visible, and Nested::e is not visible either
    }

    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        return message
    }

}
