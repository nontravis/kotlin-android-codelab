package com.thekhaeng.kotlincodelab.d.Other

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class a_Destructuring : TryItClass() {

    data class Person(val name: String, val age: Int)


    /** 1. Basic destructuring **/
    fun basicDestructuring(): String {
        val (name: String, age: Int) = Person("TheKhaeng", 23)
//        or
//        val name = person.component1()
//        val age = person.component2()
        return name + " " + age
    }


    /** 2. List destructuring **/
    fun listDestructuring(): String {
        var message: String = ""
        val persons: List<Person> = arrayListOf(
                Person("TheKhaeng", 23),
                Person("New", 29),
                Person("Gimmy", 24))

        /** Destructuring declarations also work in for-loops: when you say **/
        for ((n: String, a: Int) in persons) {
            message += "\n" + n + " " + a
        }
        return message
    }


    /** 3. Map destructuring **/
    /** { a -> ... }         one parameter
     *  { a, b -> ... }      two parameters
     *  { (a, b) -> ... }    a destructured pair
     *  { (a, b), c -> ... } a destructured pair and another parameter
     **/
    fun mapDestructuring(): String {
        var message: String = ""

        var mapPersons: Map<Int, Person> = mapOf(1 to Person("TheKhaeng", 23),
                                                 2 to Person("New", 29),
                                                 3 to Person("Gimmy", 24))

        mapPersons.mapValues { entry -> "\n${entry.value}!" }
        mapPersons.mapValues { (key, value) -> message += "\n$key. $value!" }
        mapPersons.mapValues { (_, value) -> message += "\nunused key $value!" }
        return message
    }


    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""


        message += "\n" + basicDestructuring()

        message += "\n" + listDestructuring()

        message += "\n" + mapDestructuring()


        return message
    }

}
