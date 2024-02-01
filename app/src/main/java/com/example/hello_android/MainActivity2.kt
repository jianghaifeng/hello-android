package com.example.hello_android

import android.os.Bundle
import android.view.View
import android.view.View.OnCreateContextMenuListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.back).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        finish()
    }
}