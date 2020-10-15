package com.example.activityexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val msg = intent.getStringExtra(Intent.EXTRA_TEXT)

        val msgTextView = findViewById<TextView>(R.id.msgTextView).apply {
            text = msg
        }
    }
}