package com.qi.singleinstance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {

    var activitytextview : StringBuilder ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        activitytextview = StringBuilder()

        activityBbutton?.setOnClickListener {
            startActivity(Intent(this,ActivityC :: class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        showtext("Activity B called onResume()")
    }

    override fun onPause() {
        super.onPause()
        showtext("Activity B called onPause()")
    }
    fun showtext(value : String){

        activitytextview?.append(value)?.append("\n")
        activityBtextView?.text = activitytextview.toString()
    }
}
