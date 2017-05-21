package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class c_Ranges : TryItClass() {


    /** 1. Basic range **/
    fun range(): String {
        var message: String = ""

        val int: Int = 2
        if (int in 1..10) {
            message += "\n$int in range"
        }
        message += '\n'

        for (i in 1..4)
            message += "$i "
        message += '\n'

        // index --1
        for (i in 4 downTo 1)
            message += "$i "
        message += '\n'


        // index ++2
        for (i in 1..4 step 2)
            message += "$i "
        message += '\n'


        for (i in 1 until 10) // i in [1, 10), 10 is excluded
            message += "$i "
        message += '\n'

        return message
    }


    /** 2. Utility functions **/
    fun utility(): String {
        var message: String = ""

        message += "\n" + 10.rangeTo(30)
        message += "\n" + 30.downTo(10)
        message += "\n" + 10.rangeTo(30).reversed()
        message += "\n" + 10.rangeTo(30).step(2)

        message += "\n" + (1..12 step 2).last  // progression with values [1, 3, 5, 7, 9, 11]
        message += "\n" + (1..12 step 3).last  // progression with values [1, 4, 7, 10]
        message += "\n" + (1..12 step 4).last  // progression with values [1, 5, 9]

        return message
    }


    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        message += range()

        message += utility()
        return message
    }

}
