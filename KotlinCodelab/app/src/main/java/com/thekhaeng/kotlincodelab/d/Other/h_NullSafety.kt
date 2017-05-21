package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
@Suppress("UNUSED_VALUE", "UNUSED_VARIABLE", "IfThenToSafeAccess")
class h_NullSafety : TryItClass() {


    fun sample() {
        var a: String = "abc"
//        a = null // compilation error

        var b: String? = "abc"
        b = null // ok
    }


    /** 1. Safe Calls **/
    fun safeCall(): String? {
        val b: String? = null

        if (b != null) {
            b.length
        }
        // or
        b?.length // NOTE: recommend "?."

        return b
    }


    /** 2. Elvis Operator **/
    fun elvisOperator(): String? {
        val b: String? = null

//        val l: String? = b
        val l: String = b ?: "string is null"
//        val l: String = b ?: throw NullPointerException()

        return l
    }


    /** 3. The !! Operator **/
    fun nonNullAssertOperator(){
        val b: String? = null
//        val l = b!!.length // it will throw KotlinNullPointerException if b == null
    }


    /** 4. Collections of Nullable Type **/
    fun collectionNotNull():String{
        val nullableList: List<Int?> = listOf(1, 2, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()
        return intList.toString()
    }

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        message += "\n" + safeCall()

        message += "\n" + elvisOperator()

        message += "\n" + nonNullAssertOperator()

        message += "\n" + collectionNotNull()
        return message
    }

}
