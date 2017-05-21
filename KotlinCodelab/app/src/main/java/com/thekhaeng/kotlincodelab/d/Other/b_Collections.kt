package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class b_Collections : TryItClass() {

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        val items = listOf(1, 2, 3, 4)
        message += "\n" + items.first() == 1.toString()
        message += "\n" + items.last() == 4.toString()
        message += "\n" + items.filter { it % 2 == 0 }.toString()   // returns [2, 4]

        val rwList = mutableListOf(1, 2, 3, 4)
        message += "\n" + rwList.requireNoNulls() // if null in list will throw IllegalArgumentException
        if (rwList.none { it > 6 }) message += "\nNo items above 6"  // prints "No items above 6
        val item = rwList.firstOrNull()
        message += "\n" + item

        return message
    }

}
