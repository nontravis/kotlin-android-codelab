package com.thekhaeng.kotlincodelab.a.Basic

import com.thekhaeng.kotlincodelab.TryItClass
/** 1. change name package **/
import com.thekhaeng.kotlincodelab.a.Basic.examplePkg.ExamplePackage as TestPackage

/**
 * Created by thekhaeng on 5/19/2017 AD.
 */
class b_Package : TryItClass() {

    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        /** 1. change name package **/
        var examplePkg = TestPackage() // Actually, TestPackage is ExamplePackage

        return message
    }
}