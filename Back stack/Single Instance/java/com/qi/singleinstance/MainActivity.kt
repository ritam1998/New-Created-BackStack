package com.qi.singleinstance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mainactivitymessage : StringBuilder ?= null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainactivitymessage = StringBuilder()

        mainactivitybutton?.setOnClickListener {
            startActivity(Intent(this,ActivityB :: class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        onshow("Main Activity called onResume()")
    }

    override fun onPause() {
        super.onPause()
        onshow("Main Activity called onPause")
    }
    fun onshow(value : String){

        mainactivitymessage?.append(value)?.append("\n")
        activitymaintextView?.text = mainactivitymessage.toString()
    }
}
