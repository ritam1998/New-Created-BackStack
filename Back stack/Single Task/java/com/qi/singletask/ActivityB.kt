package com.qi.singletask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {

    var activityBtext : StringBuilder ?= null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        activityBtext = StringBuilder()

        activityBbutton?.setOnClickListener {
            startActivity(Intent(this,ActivityC :: class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        showText("Activity B called onResume()")
    }

    override fun onPause() {
        super.onPause()
        showText("Activity B called onPause()")
    }
    fun showText(value : String){

        activityBtext?.append(value)?.append("\n")
        secondActivityText?.text = activityBtext.toString()
    }
}
