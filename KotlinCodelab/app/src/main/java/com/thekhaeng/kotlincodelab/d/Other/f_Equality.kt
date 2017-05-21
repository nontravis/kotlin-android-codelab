package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class f_Equality : TryItClass() {


    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        /**
         *  Reference equality "===" : ref same object
         *  Structural equality "=="
         **/

        val int1: Int = 10000  //Note JAVA: int int1 = 10000;
        val int2: Int = 10000  //Note JAVA: int int2 = 10000;
        val int3: Int = int1

        val integer1: Int? = 10000  //Note JAVA: Integer integer1 = new Integer(10000);
        val integer2: Int? = 10000  //Note JAVA: Integer integer2 = new Integer(10000);
        val integer3: Int? = integer1 //Note JAVA: Integer integer3 = int1;

        message += "\n" + (int1 == int2).toString()
        message += "\n" + (int1 === int2).toString()
        message += "\n" + (int1 === int3).toString()

        message += "\n"

        message += "\n" + (integer1 == integer2).toString()
        message += "\n" + (integer1 === integer2).toString()
        message += "\n" + (integer1 === integer3).toString()
        return message
    }

}
