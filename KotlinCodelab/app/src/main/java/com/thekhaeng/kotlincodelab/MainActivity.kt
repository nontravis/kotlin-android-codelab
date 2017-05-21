package com.thekhaeng.kotlincodelab

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.thekhaeng.kotlincodelab.a.Basic.a_BasicType
import com.thekhaeng.kotlincodelab.a.Basic.b_Package
import com.thekhaeng.kotlincodelab.a.Basic.c_ControlFlow
import com.thekhaeng.kotlincodelab.a.Basic.d_ReturnAndJump
import com.thekhaeng.kotlincodelab.b.ClassAndObject.*
import com.thekhaeng.kotlincodelab.c.FuctionsAndLamdas.a_Functions
import com.thekhaeng.kotlincodelab.c.FuctionsAndLamdas.b_Lambdas
import com.thekhaeng.kotlincodelab.c.FuctionsAndLamdas.c_InlineFunctions
import com.thekhaeng.kotlincodelab.c.FuctionsAndLamdas.d_Coroutines
import com.thekhaeng.kotlincodelab.d.Other.*
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.textColor

class MainActivity : AppCompatActivity() {

    private var containerLecture: LinearLayout? = null

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        containerLecture = findViewById(R.id.container_lecture) as LinearLayout?

        containerLecture?.addView(createTitle("Basics"))
        containerLecture?.addView(createTryButton(a_BasicType()))
        containerLecture?.addView(createTryButton(b_Package()))
        containerLecture?.addView(createTryButton(c_ControlFlow()))
        containerLecture?.addView(createTryButton(d_ReturnAndJump()))

        containerLecture?.addView(createTitle("Classes and Objects"))
        containerLecture?.addView(createTryButton(a_ClassAndInheritance()))
        containerLecture?.addView(createTryButton(b_PropertiesAndFields()))
        containerLecture?.addView(createTryButton(c_Interface()))
        containerLecture?.addView(createTryButton(d_VisiblityModifiers()))
        containerLecture?.addView(createTryButton(e_Extensions()))
        containerLecture?.addView(createTryButton(f_DataClasses()))
        containerLecture?.addView(createTryButton(g_SealedClasses()))
        containerLecture?.addView(createTryButton(h_Generics()))
        containerLecture?.addView(createTryButton(i_NestedClasses()))
        containerLecture?.addView(createTryButton(j_EnumClasses()))
        containerLecture?.addView(createTryButton(k_Objects()))
        containerLecture?.addView(createTryButton(l_Delegation()))
        containerLecture?.addView(createTryButton(m_DelegationProperties()))

        containerLecture?.addView(createTitle("Functions and Lamdas"))
        containerLecture?.addView(createTryButton(a_Functions()))
        containerLecture?.addView(createTryButton(b_Lambdas()))
        containerLecture?.addView(createTryButton(c_InlineFunctions()))
        containerLecture?.addView(createTryButton(d_Coroutines()))

        containerLecture?.addView(createTitle("Other"))
        containerLecture?.addView(createTryButton(a_Destructuring()))
        containerLecture?.addView(createTryButton(b_Collections()))
        containerLecture?.addView(createTryButton(c_Ranges()))
        containerLecture?.addView(createTryButton(d_TypeChecksAndCasts()))
        containerLecture?.addView(createTryButton(e_ThisExpressions()))
        containerLecture?.addView(createTryButton(f_Equality()))
        containerLecture?.addView(createTryButton(g_OperatorOverloading()))
        containerLecture?.addView(createTryButton(h_NullSafety()))
        containerLecture?.addView(createTryButton(i_Exceptions()))
        containerLecture?.addView(createTryButton(j_Annotation()))
        containerLecture?.addView(createTryButton(k_Reflection()))
        containerLecture?.addView(createTryButton(l_TypeSafeBuilders()))
        containerLecture?.addView(createTryButton(m_TypeAliases()))
    }

    @SuppressLint("SetTextI18n")
    fun createTitle(title: String): TextView {
        val space = resources.getDimension(R.dimen.default_padding_margin_large).toInt()
        val textView = TextView(this)
        textView.textSize = 24f
        textView.text = title
        textView.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        val margin = textView.layoutParams as ViewGroup.MarginLayoutParams
        margin.setMargins(space, space, space, space)
        return textView
    }


    @SuppressLint("SetTextI18n")
    fun createTryButton(tryIt: TryItClass): Button {
        val className = tryIt.javaClass.simpleName
        val space = resources.getDimension(R.dimen.default_padding_margin_large).toInt()
        val btn = TryItButton(this)
        btn.tryIt = tryIt
        btn.text = "Try $className.kt"
        btn.setAllCaps(false)
        btn.textColor = (ContextCompat.getColor(this, R.color.md_white))
        btn.backgroundColor = ContextCompat.getColor(this, R.color.colorAccent)
        btn.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        val margin = btn.layoutParams as ViewGroup.MarginLayoutParams
        margin.setMargins(space, 0, space, space)
        return btn
    }


}
