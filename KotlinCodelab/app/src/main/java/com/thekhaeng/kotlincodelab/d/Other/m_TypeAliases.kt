package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */

typealias ReflectionLecture = k_Reflection
typealias Predicate<T> = (T) -> Boolean

class m_TypeAliases : TryItClass() {

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        var obj: ReflectionLecture = ReflectionLecture()

//        val p: (Int) -> Boolean = { it > 0 }
        val p: Predicate<Int> = { it > 0 }
        message += "\n" + listOf(1, -2).filter(p) // prints "[1]"

        return message
    }

}
