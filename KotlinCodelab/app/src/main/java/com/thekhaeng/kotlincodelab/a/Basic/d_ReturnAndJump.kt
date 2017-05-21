package com.thekhaeng.kotlincodelab.a.Basic

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */

class d_ReturnAndJump : TryItClass() {

    //NOTE: return, break, continue

    val s1: String? = null
    var s2: String = ""

    fun returnTest() {
        val s2 = s1 ?: return
    }

    fun labelExample(): String {
        var str: String = ""
        loop@
        for (i in 1..10) {
            // loop@
            for (j in 1..10) {
                str += j.toString() + " "
                if (j == 5) {
                    str += "\n"
                    break@loop
                }
            }
        }

        return str;
    }

    fun returnLabelExample(): String {
        var str: String = ""
        val ints: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)

        ints.forEach lit@ {
            if (it == 4) return@lit
            str += it.toString() + " "
        }
        str += "\n"


        ints.forEach {
            if (it == 4) return@forEach
            str += it.toString() + " "
        }
        str += "\n"


        ints.forEach(fun(value: Int) { //NOTE: We recommend this pattern
            if (value == 4) return
            str += value.toString() + " "
        })
        str += "\n"

        return str
    }


    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")
        returnTest()
        message += s2 + "\n"

        message += labelExample()
        message += returnLabelExample()

        return message
    }

}
