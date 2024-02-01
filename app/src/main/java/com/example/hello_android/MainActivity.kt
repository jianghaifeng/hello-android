package com.example.hello_android

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val tag = "tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "MainActivity onCreate")
        setContentView(R.layout.activity_main)

        val btn  = findViewById<Button>(R.id.jumpBtn)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.jump2)
        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        Log.d(tag, "MainActivity onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag, "MainActivity onResume")
        super.onResume()
    }


    override fun onPause() {
        Log.d(tag, "MainActivity onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "MainActivity onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag, "MainActivity onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(tag, "MainActivity onRestart")
        super.onRestart()
    }
}
