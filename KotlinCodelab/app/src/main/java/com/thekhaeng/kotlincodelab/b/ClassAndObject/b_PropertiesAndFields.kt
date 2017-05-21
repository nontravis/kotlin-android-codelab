package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */

/**
 * NOTE: Compile-Time Constants
 *  - Top-level or member of an object
 *  - Initialized with a value of type String or a primitive type
 *  - No custom getter
 **/
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

class b_PropertiesAndFields : TryItClass() {
    /** 1. Declaring Properties **/
    // var = mutable
    // val = immutable = final in JAVA.
    class Address1 {
        private var name: String = ""
        var street: String = ""
        var city: String = ""
        var state: String? = ""
        var zip: String = ""
    }

    /** 2. Getters and Setters **/
    // kotlin auto generate getter setter
    class Address2 {

        // NOTE: kotlin is not like JAVA
        //       You don't need to use private field and create getter setter
        private var name: String = ""
        // Don't need to use getName
        fun getName(): String {
            return name
        }
        // Don't need to use setName()
        fun setName(value: String) {
            name = value
        }

        // NOTE: use default public kotlin will generate getter and setter for you
        //       It seem like you access variable in other class directly but it's not
        var street: String = ""
        // NOTE: you can modify getter setter here
//            get() = field  // field is call "Backing Fields"
//            set(value) {
//                field = value
//            }

        // If you uncomment -> compile error
        // fun getStreet(): String{
        //    return street;
        // }

        val isEmpty
            get() = name.isEmpty() // has type Boolean
                    && city.isEmpty()
                    && state.isEmpty()
                    && zip.isEmpty()

        var city: String = ""
        var state: String = ""
        var zip: String = ""

    }

    /** 3. Late init properties **/
    /** Normally, properties declared as having a non-null type must be initialized in the constructor.
     *  However, fairly often this is not convenient.
     *
     *  For example, properties can be initialized through
     *  dependency injection, or in the setup method of a unit test. In this case,
     *  you cannot supply a non-null initializer in the constructor,
     *  but you still want to avoid null checks when referencing
     *  the property inside the body of a class.
     **/
    class LateInitProperties {
        lateinit var lateString: String
    }

    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        var obj = Address2()
        obj.street = "testtest"
        message += "\n" + obj.street

        var late = LateInitProperties()
        message += "\n" + late.lateString // will error because lateString it's not initialize

        return message
    }

}