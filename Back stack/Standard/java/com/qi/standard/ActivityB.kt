package com.qi.standard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {

    var textShow : StringBuilder? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        textShow = StringBuilder()
        showtext("Activity B onCreate()")
        buttonB?.setOnClickListener {
            startActivity(Intent(this,ActivityC :: class.java))

        }
    }

    override fun onResume() {

        super.onResume()
        showtext("Activity B onResume()")
    }

    override fun onPause() {

        super.onPause()
        showtext("Activity B onPause()")
    }

    override fun onDestroy() {
        super.onDestroy()
        showtext("Activity B onDestroy()")
    }
    private fun showtext(value : String){
        textShow?.append(value)?.append("\n")
        activityBtext?.text = textShow.toString()
    }
}
