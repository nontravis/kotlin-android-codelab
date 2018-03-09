package com.thekhaeng.kotlincodelab

import android.content.Context
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Toast

/**
 * Created by thekhaeng on 5/19/2017 AD.
 */

class TryItButton : AppCompatButton {
    companion object {
        val TAG = TryItButton::class.simpleName
    }

    var tryIt: TryItClass? = null

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                printLogTry()
            }
        })
    }


    fun printLogTry() {
        val str = tryIt?.getTryItString()
        Toast.makeText(context, "See log", Toast.LENGTH_SHORT).show()
        Log.i(TAG, str)
    }

}
