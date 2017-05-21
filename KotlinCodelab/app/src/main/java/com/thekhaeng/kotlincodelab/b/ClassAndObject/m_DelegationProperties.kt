package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass
import kotlin.reflect.KProperty

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */


class m_DelegationProperties : TryItClass() {

    class Delegate {
        operator
        fun getValue(thisRef: Any?, property: KProperty<*>): String {
            return "$thisRef, thank you for delegating '${property.name}' to me!"
        }

        operator
        fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
            println("$value has been assigned to '${property.name} in $thisRef.'")
        }
    }

    class Example {
        var p: String by Delegate()
    }

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        val e = Example()
        message += "\n" + e.p

        return message
    }

}




