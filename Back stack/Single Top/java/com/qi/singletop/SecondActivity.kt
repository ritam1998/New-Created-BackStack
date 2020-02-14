package com.qi.singletop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    var secondActivityIdText : StringBuilder ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val strBuf = StringBuffer()
        strBuf.append("Task Id : ")
        strBuf.append(this.taskId)
        strBuf.append(" , Activity Id : ")
        strBuf.append(this.toString())

        // Set above info in TextView object.


        secondActivityIdText = StringBuilder()

        // Log above info in logcat console.
        Log.d("second Activity", strBuf.toString())

        // When click this button, start a new instance of First activity.
        val startFirstActivityFromSecondActivityButton = findViewById(R.id.startFirstActivityFromSecondActivityButton) as Button

        startFirstActivityFromSecondActivityButton.setOnClickListener{
            startActivity(Intent(this,MainActivity :: class.java))
        }

        startSecondActivityButton?.setOnClickListener {
            startActivity(Intent(this,SecondActivity :: class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        showText("second Activity onResume()")
    }

    override fun onPause() {
        super.onPause()
        showText("second Activity onPause()")
    }
    fun showText(value : String){

        secondActivityIdText?.append(value)?.append("\n")
        secondActivityIdTextView?.text = secondActivityIdText.toString()
    }
}
