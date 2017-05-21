package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class f_DataClasses : TryItClass() {

    class User {
        var name: String = ""
        var age: Int = 0
        var birthDay: String = ""

        constructor(name: String, age: Int, birthDay: String) {
            this.name = name
            this.age = age
            this.birthDay = birthDay
        }

        fun copy(name: String = this.name, age: Int = this.age) = User(name, age, birthDay)

        override
        fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other?.javaClass != javaClass) return false

            other as User

            if (name != other.name) return false
            if (age != other.age) return false
            if (birthDay != other.birthDay) return false

            return true
        }

        override
        fun hashCode(): Int {
            var result = name.hashCode()
            result = 31 * result + age
            result = 31 * result + birthDay.hashCode()
            return result
        }

        override
        fun toString(): String {
            return "User(name='$name', age=$age, birthDay='$birthDay')"
        }


        /**  Destructuring Declarations **/
        operator
        fun component1(): Any {
            return name
        }

        operator
        fun component2(): Any {
            return age
        }

        operator
        fun component3(): Any {
            return birthDay
        }

    }

    /**
     * data use with primary constructor
     *  - equals()/hashCode()
     *  - toString()
     *  - componentN() (destructuring)
     *  - copy()
     * NOTE: 1 line :)
     **/
    data class User2(val name: String, val age: Int, val birthDay: String)

    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        var user1 = User("TheKhaeng", 23, "1993")
        message += "\n" + user1
        var userCopy = user1.copy(age = 30)
        message += "\n" + userCopy

        val (name, age, birthDay) = user1
        message += "\n$name, $age years of age, $birthDay"


        var user2 = User2("TheKhaeng", 23, "1993")
        var user3 = User2("TheKhaeng", 23, "1993")
        val (name2, age2, birthDay2) = user2
        message += "\n" + (user2 == user3).toString()


        return message
    }

}


