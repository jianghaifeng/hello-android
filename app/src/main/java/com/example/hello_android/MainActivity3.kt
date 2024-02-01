package com.example.hello_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        findViewById<ImageView>(R.id.back).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        finish()
    }
}