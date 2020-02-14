package com.qi.singletask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_c.*

class ActivityC : AppCompatActivity() {

    var activitytextview : StringBuilder ?= null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        activitytextview = StringBuilder()

        callBbutton?.setOnClickListener {
            startActivity(Intent(this,ActivityB :: class.java))
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
    fun showText(value : String){
        activitytextview?.append(value)?.append("\n")
        activityCtextView?.text = activitytextview?.toString()
    }
}
