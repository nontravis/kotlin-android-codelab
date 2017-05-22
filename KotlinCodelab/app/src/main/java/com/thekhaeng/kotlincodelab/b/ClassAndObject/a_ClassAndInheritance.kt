package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

@Suppress("UNUSED_PARAMETER", "unused", "RemoveEmptyClassBody", "JoinDeclarationAndAssignment")
/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class a_ClassAndInheritance : TryItClass() {

    /**
     *  NOTE: Class Members
     *  Classes can contain
     *   - Constructors and initializer blocks
     *   - Functions
     *   - Properties
     *   - Nested and Inner Classes
     *   - Object Declarations
     **/


    /** 1. Primary constructor **/
    class Primary1 constructor(var firstName: String) { // default is val

    }
    //or
    class Primary2(firstName: String) {
    }
    // NOTE: On the JVM, if all of the parameters of the primary constructor have default values, the compiler
    class Customer(val customerName: String) // = class Customer(val customerName: String = "")


    /** 2. Init primary constructor **/
    /** The primary constructor cannot contain any code. Initialization code can be placed in **/
    /** initializer blocks, which are prefixed with the init keyword: **/
    class Primary3(firstName: String) {
        val upperFirstName: String

        init { // use with primary code
            upperFirstName = firstName.toUpperCase()
            // some code ...
        }
    }
    //or
    class Primary4(
            firstName: String,
            lastName: String) {
        var fullName: String = ""

        init {
            this.fullName = firstName + " " + lastName
        }
    }


    /** 3. Secondary constructor **/
    //NOTE: This pattern it's more readable
    open class Secondary2 {
        var firstName: String
        var lastName: String
        var fullName: String

        /** by default **/
        // constructor()

        // secondary
        constructor(firstName: String = "default value", lastName: String = "default value") {
            this.firstName = firstName
            this.lastName = lastName
            this.fullName = firstName + " " + lastName
        }

        open fun v() {}
    }


    /** 4. Inheritance **/
    /** The open annotation on a class is the opposite of Java's final: it allows others
     *  to inherit from this class. By default, NOTE: all classes in Kotlin are final, method also
     **/
    final class Inheritance : Secondary2() {

        override
        fun v() {
            super.v()
        }
    }


    /** 5. Interface **/
    interface BarInterface {
        val count: Int

        // NOTE: JAVA 8 feature
        fun f(): String { // interface members are 'open' by default
            return "interface"
        }

    }

    class Bar1(override val count: Int) : BarInterface


    /** 6. Override rules **/
    open class Bar2 {

        open fun f(): String {
            return "A"
        }

        fun a(): String {
            return "a"
        }
    }

    class ExtraBar(override val count: Int) : Bar2(), BarInterface {
        // The compiler requires f() to be overridden:
        override
        fun f(): String {
            var str: String = "\n"
            str += super<Bar2>.f() // call to Bar2.f()
            str += " " + super<BarInterface>.f() + "\n" // call to BarInterface.f()
            return str
        }
    }

    /** 7. Abstract class **/
    abstract class Base {
        abstract fun f()
    }

    class Derived : Base() {
        override fun f() {}
    }


    /** 8. Companion Objects **/
    /** In Kotlin, unlike Java or C#, NOTE: kotlin classes do not have static methods.
     *  If you need to write a function that can be called without having a class instance but
     *  needs access to the internals of a class (for example, a factory method),
     *  NOTE: so if you want to use "static" property/method needs to be placed inside this companion.
     */
    companion object {
        val TAG = a_ClassAndInheritance::class.simpleName
    }

    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")
        val obj = Secondary2()

        message += obj.firstName

        message += ExtraBar(1).f()

        message += "TAG: " + a_ClassAndInheritance.TAG


        return message
    }
}