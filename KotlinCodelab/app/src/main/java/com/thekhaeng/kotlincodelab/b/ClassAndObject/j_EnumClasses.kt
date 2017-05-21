package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */


class j_EnumClasses : TryItClass() {

    enum class Direction {
        NORTH, SOUTH, WEST, EAST
    }

    enum class Color(val rgb: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }

    enum class ProtocolState {
        WAITING {
            override
            fun signal() = TALKING
        },

        TALKING {
            override
            fun signal() = WAITING
        };

        // Enum constants can also declare their own anonymous classes
        abstract fun signal(): ProtocolState
    }

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        message += "\n" + Direction.EAST
        message += "\n" + Color.RED
        message += "\n" + Color.RED.rgb

        message += "\n" + Color.valueOf("RED")
        message += "\n"
        for (value in Color.values()) {
            message += value.toString() + " "
        }

        message += "\n" + ProtocolState.TALKING.signal()


        return message
    }

}




