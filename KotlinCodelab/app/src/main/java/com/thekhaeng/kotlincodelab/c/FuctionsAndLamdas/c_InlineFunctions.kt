package com.thekhaeng.kotlincodelab.c.FuctionsAndLamdas

import com.thekhaeng.kotlincodelab.TryItClass

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class c_InlineFunctions : TryItClass() {

    /**
     * NOTE: Inline function concept
     * Inline functions are a lot like a placeholder. Once you define an inline function,
     * using the 'inline' keyword, whenever you call that function the compiler will replace
     * the function call with the actual code from the function. Unlike noinline function
     *
     * So inline functions are very good for saving time but if you use them too often
     * or with large functions you will have a tremendously large program.
     * Sometimes large programs are actually less efficient,
     * and therefore they will run more slowly than before.
     * Inline functions are best for small functions that are called often.
     */

    class Lock {
        fun lock() {/*...*/
        }

        fun unlock() {/*...*/
        }
    }

    /** 1. Inline function **/
    //NOTE: ".()" read all field/method in Lock
    inline fun lock(lock: Lock, body: Lock.() -> Unit) {
        lock.lock()
        try {
            lock.body()
        } finally {
            lock.unlock()
        }
    }

    /** 2. No inline function **/
    // inline function, lambda argument will be inline by default
    // you can mark some of your function with noinline if you want
    inline fun lock2(lock: Lock, body1: Lock.() -> Unit, noinline body2: Lock.() -> Unit) {
        lock.lock()
        try {
            lock.body1()
            lock.body2()
        } finally {
            lock.unlock()
        }
    }

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""

        lock(Lock()) {
            message += "do something"
        }

        lock2(Lock(), {

        }) {

        }

        return message
    }
}