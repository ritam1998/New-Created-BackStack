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
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val strBuf = StringBuffer()
    var firstActivityIdText : StringBuilder ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create Task and activity related id info.

        strBuf.append("Task Id : ")
        strBuf.append(this.taskId)
        strBuf.append(" , Activity Id : ")
        strBuf.append(this.toString())

        // Set above info in TextView object.
        firstActivityIdText = StringBuilder()


        // Log above info in logcat console.
        Log.d("mainActivity", strBuf.toString())

        // When click this button, start a new instance of current activity.

        val startFirstActivityButton = findViewById(R.id.startFirstActivityButton) as Button

        startFirstActivityButton.setOnClickListener{
            startActivity(Intent(this,MainActivity :: class.java))
        }

        // When click this button, start a new instance of second activity.
        val startSecondActivityButton = findViewById(R.id.startSecondActivityButton) as Button

        startSecondActivityButton.setOnClickListener{
            startActivity(Intent(this,SecondActivity :: class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        showText("MainActivity call onResume() method")
    }

    override fun onPause() {
        super.onPause()
        showText("MainActivity call onPause() method")
    }
    fun showText(value : String){

        firstActivityIdText?.append(value)
        firstActivityIdTextView?.text = firstActivityIdText.toString()
    }
}
