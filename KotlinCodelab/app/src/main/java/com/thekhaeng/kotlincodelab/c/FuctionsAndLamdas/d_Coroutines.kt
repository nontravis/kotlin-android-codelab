@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package com.thekhaeng.kotlincodelab.c.FuctionsAndLamdas

import com.thekhaeng.kotlincodelab.TryItClass
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Created by thekhaeng on 5/20/2017 AD.
 */
class d_Coroutines : TryItClass() {

    /**
     * NOTE: Coroutines concept
     * Some APIs initiate long-running operations (such as network IO, file IO, CPU- or GPU-intensive work, etc)
     * and require the caller to block until they complete. Coroutines provide a way to avoid blocking a thread
     *
     * Coroutines simplify asynchronous programming by putting the complications into libraries.
     * The logic of the program can be expressed sequentially in a coroutine,
     * and the underlying library will figure out the asynchrony for us.
     *
     * Many asynchronous mechanisms available in other languages can be implemented as
     * libraries using Kotlin coroutines. This includes "async/await" from C# and ECMAScript,
     * "channels" and "select" from Go, and "generators/yield" from C# and Python.
     */


    /** NOTE: Using coroutines
     *   IDE: Use a quick-fix (Alt+Enter) or modify the facet options
     *   (Project Structure -> Modules -> Your Module -> Compiler -> Coroutines (experimental))
     *
     *   [For android]
     *   compile "org.jetbrains.kotlinx:kotlinx-coroutines-android:0.15"
     *   gradle.properties -> kotlin.coroutines=enable
     **/
    suspend fun doSomething(): String {
        delay(2000L)
        return "do something "
    }

    override
    fun setupLogcatMessage(): String {
        // TODO:("Try example code if you want :)")
        var message = ""


        val one = async(CommonPool) { doSomething() }
        val two = async(CommonPool) { doSomething() }
        runBlocking(CommonPool) {
            val time = measureTimeMillis {
//            message += "\n" + doSomething()
//            message += "\n" + doSomething()
                message += "\n"+"The answer is \n${one.await()}\n${two.await()}" // run at same time
            }
            message += "\n" + time
        }
        return message
    }
}