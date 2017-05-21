package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass
import kotlin.reflect.KMutableProperty1

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class k_Reflection : TryItClass() {
    var classProperty: String = "class property"

    /**
     *  compile "org.jetbrains.kotlin:kotlin-reflect:$kotlin_version"
     */
    companion object {
        val TAG = k_Reflection::class.simpleName
    }

    fun isOdd(x: Int) = x % 2 != 0


    /** 1. ::Function reference **/
    val predicate: (Int) -> Boolean = this::isOdd

    fun functionReference(): String {
        var message: String = ""

        val numbers: List<Int> = listOf(1, 2, 3)
        message += "\n" + numbers.filter(this::isOdd)  // "::" = function reference
        //or
        message += "\n" + numbers.filter(predicate)
        message += "\n" + numbers.filter { int -> isOdd(int) } // lambda

        return message
    }


    /** 2. ::Property reference **/
    fun propertyReference(): String {
        var message: String = ""
        var ref: KMutableProperty1<k_Reflection, String> = k_Reflection::classProperty
        message += "\n" + ref.get(k_Reflection())

        message += "\n" + this::classProperty.get()

        this::classProperty.set("test")
        message += "\n" + this::classProperty.get()

        return message
    }


    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""
        message += "\n" + functionReference()

        message += "\n" + propertyReference()
        return message
    }

}
