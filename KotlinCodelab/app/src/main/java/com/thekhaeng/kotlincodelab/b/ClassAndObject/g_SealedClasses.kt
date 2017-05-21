package com.thekhaeng.kotlincodelab.b.ClassAndObject

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */


/**
 * The key benefit of using sealed classes comes into play when you use them in a when expression.
 * If it's possible to verify that the statement covers all cases, you don't need to add an
 * else clause to the statement.
 **/
sealed class Expr

class Const(val number: Double) : Expr()
class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

sealed class Pet(val name: String) {
    class Dog(name: String) : Pet(name)
    class Cat(name: String) : Pet(name)
    class Tiger(name: String) : Pet(name)
    class Penguin(name: String) : Pet(name)
}


class g_SealedClasses : TryItClass() {

    fun eval(expr: Expr): Double =
            when (expr) {
                is Const -> expr.number
                is Sum -> eval(expr.e1) + eval(expr.e2)
                NotANumber -> Double.NaN
            }

    override
    fun setupLogcatMessage(): String {
        var message = ""
        // TODO:("Try example code if you want :)")

        return message
    }

}




