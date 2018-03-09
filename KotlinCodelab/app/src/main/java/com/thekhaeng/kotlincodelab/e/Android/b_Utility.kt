
package com.thekhaeng.kotlincodelab.e.Android

import android.app.Activity
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thekhaeng.kotlincodelab.R
import kotlinx.android.synthetic.main.activity_extension.extension_container as extensionContainer
import kotlinx.android.synthetic.main.activity_extension.extension_tv_1 as tvExtension1
import kotlinx.android.synthetic.main.activity_extension.extension_tv_2 as tvExtension2

/**
 * Created by thekhaeng on 5/21/2017 AD.
 */

/** Example 1 **/
@JvmName("ExtensionsUtils")
fun ViewGroup.inflate(layoutId: Int): View {
    return LayoutInflater.from(context).inflate(layoutId, this, false)
}

/** Example 2 **/
@JvmName("StringUtils")
fun String.encodeSpaces(): String {
    return this.replace(" ", "_")
}

/** Example 3 **/
@JvmName("StringUtils")
fun Activity.getAppVersion(activity: Activity):String{
    try {
        var manager = activity.packageManager
        var info:String = manager.getPackageInfo(activity.packageName, 0).versionName
        return info
    }catch (e: PackageManager.NameNotFoundException){
        // do nothing
    }
    return "0.0"
}

class UtilityDemoActivity : AppCompatActivity() {

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension)

        // old code:
//        val view = inflater.inflate(R.layout.example_layout, container, false)
        // replaced with:
        val view = extensionContainer?.inflate(R.layout.example_layout)
    }

}
