package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class e_Extensions : TryItClass() {

    /**
     * Kotlin extension functions will let us add new functions to existing classes
     * that wouldn´t be able to be modified otherwise. We can, for instance,
     * add a new method to an activity that let us show a toast in a much more simple nomenclature:
     **/

    /** 1. Extension function **/
    // MutableList is interface in file Collections.kt
    // You can add new Method to your existing classes
    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1] // 'this' corresponds to the list
        this[index1] = this[index2]
        this[index2] = tmp
    }


    /** 2. Member always wins **/
    /** If a class has a member function, and an extension function is defined which has
     *  the same receiver type, the same name and is applicable to given arguments,
     *  NOTE: the member always wins. For example:
     */
    class C {
        fun foo(): String {
            return "member"
        }
    }

    fun C.foo(): String {
        return "extension"
    }
    // NOTE: If we call c.foo() of any c of type C, it will print "member", not "extension".
    /** However, it's perfectly OK for extension functions to overload member functions
     *  which have the same name but a different signature:
     **/
    fun C.foo(i: Int) {
        println("extension")
    }


    /** 3. Extension other example usage **/
    fun Any?.toString(): String {
        if (this == null) return "value is null"
        // after the null check, 'this' is autocast to a non-null type, so the toString() below
        // resolves to the member function of the Any class
        return toString()
    }

    fun ByteArray.toHex(): String {
        return "hex"
    }


    /** 4. Extension properties **/
    val <T> List<T>.lastIndex: Int
        get() = size - 1


    /** 5. Companion object extensions **/
    class MyClass {
        companion object {}  // will be called "Companion"
    }

    fun MyClass.Companion.foo(): String {
        return "foo"
    }


    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        val l = mutableListOf(1, 2, 3)
        l.swap(0, 2)

        message += "\n" + l.toString()

        message += "\n" + C().foo()

        message += "\n" + byteArrayOf().toHex()

        var test: String? = null
        message += "\n" + test.toString()

        var ints: List<Int> = arrayListOf(1, 2, 3, 4, 5, 6)
        message += "\n" + ints.lastIndex

        message += "\n" + MyClass.foo()

        return message
    }
}



