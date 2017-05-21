package com.thekhaeng.kotlincodelab

/**
 * Created by thekhaeng on 5/19/2017 AD.
 */
abstract class TryItClass {

    abstract fun setupLogcatMessage(): String

    fun getTryItString(): String {
        val className = this.javaClass.simpleName;
        var str = "\n\n/*======================= Try $className.kt =======================*/\n"
        str += setupLogcatMessage()
        str += "\n\n/*======================= End $className.kt =======================*/\n"
        return str;
    }
}