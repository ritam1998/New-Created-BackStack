package com.qi.standard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_c.*

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        buttonC?.setOnClickListener {
            startActivity(Intent(this,ActivityD :: class.java))
        }
    }

    override fun onResume() {
        super.onResume()

        showText("Activity C onResume()")
    }

    override fun onPause() {
        super.onPause()
        showText("Activity C onPause()")
    }
    fun showText(value : String){
        activityCtext?.text = value.toString()
    }
}
