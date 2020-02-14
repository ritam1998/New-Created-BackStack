package com.qi.standard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_d.*

class ActivityD : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)

        finishButton?.setOnClickListener {
            finish()
        }
        callBActivity.setOnClickListener {
            startActivity(Intent(this,ActivityB :: class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        showText("call D onResume()")
    }

    override fun onPause() {
        super.onPause()
        showText("call D onPause()")
    }
    fun showText(value : String){
        activityDtext.text = value.toString()
    }
}
