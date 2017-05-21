package com.thekhaeng.kotlincodelab.e.Android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import kotlinx.android.synthetic.main.activity_extension.extension_container as extensionContainer
import kotlinx.android.synthetic.main.activity_extension.extension_tv_1 as tvExtension1
import kotlinx.android.synthetic.main.activity_extension.extension_tv_2 as tvExtension2

/**
 * Created by thekhaeng on 5/21/2017 AD.
 */

class ExampleActivity2 : AppCompatActivity() {

    /**
     * NOTE: create layouts from code
     *   compile 'org.jetbrains.anko:anko-sdk15:0.8.2'
     *   compile "org.jetbrains.anko:anko-support-v4:$anko_version"
     *   compile "org.jetbrains.anko:anko-appcompat-v7:$anko_version"
     */

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(16)
            var name = editText {
                hint = "Name"
                textSize = 24f
            }
            editText {
                hint = "Password"
                textSize = 24f
            }
            button("Say Hello") {
                onClick { toast("Hello, ${name.text}!") }
            }
        }
    }

}
