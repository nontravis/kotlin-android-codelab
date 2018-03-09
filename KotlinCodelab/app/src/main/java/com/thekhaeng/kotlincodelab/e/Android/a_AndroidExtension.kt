package com.thekhaeng.kotlincodelab.e.Android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.thekhaeng.kotlincodelab.R
import kotlinx.android.synthetic.main.activity_extension.extension_container as extensionContainer
import kotlinx.android.synthetic.main.activity_extension.extension_tv_1 as tvExtension1
import kotlinx.android.synthetic.main.activity_extension.extension_tv_2 as tvExtension2

class AndroidExtensionDemoActivity : AppCompatActivity() {

    /**
     * NOTE: apply plugin: 'kotlin-android-extensions'
     **/

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension)

        // you can change name at import file -> "as"
        tvExtension1.text = "1"
        tvExtension2.text = "2"

    }
}

