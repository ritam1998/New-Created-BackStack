package com.qi.singletask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mainActivityTextview : StringBuilder ?= null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityTextview = StringBuilder()

        mainactivitybutton?.setOnClickListener {
            startActivity(Intent(this,ActivityB :: class.java))
        }

    }

    override fun onResume() {
        super.onResume()
        showText("MainActivity called onResume()")
    }

    override fun onPause() {
        super.onPause()
        showText("MainActivity called onPause()")
    }
    fun  showText(value : String){

        mainActivityTextview?.append(value)?.append("\n")
        mainActivity?.text = mainActivityTextview
    }
}
