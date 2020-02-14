package com.qi.singleinstance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_c.*

class ActivityC : AppCompatActivity() {

    var activitycTextview : StringBuilder ?= null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        activitycTextview = StringBuilder()

        activityCbutton?.setOnClickListener {
            startActivity(Intent(this,MainActivity :: class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun onResume() {
        super.onResume()
        showText("Activity C called onResume()")
    }

    override fun onPause() {
        super.onPause()
        showText("Activity C called onPause()")
    }
    fun showText(value : String){
        activitycTextview?.append(value)?.append("\n")
        activityCtextView.text = activitycTextview?.toString()
    }
}
