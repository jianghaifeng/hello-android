package com.example.hello_android

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private val tag = "tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "MainActivity onCreate")
        setContentView(R.layout.activity_main)
        val response = findViewById<TextView>(R.id.response)
        val resultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { r ->
                if (r.resultCode == Activity.RESULT_OK) {
                    val respTime = r.data?.getStringExtra("response_time")
                    val respContent = r.data?.getStringExtra("response_content")
                    "$respTime,$respContent".also { response.text = it }
                }
            }

        val btn = findViewById<Button>(R.id.jumpBtn)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.jump2)
        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            val bundle = Bundle()
            bundle.putString(
                "requestTime",
                SimpleDateFormat("y-MM-dd hh:mm:ss", Locale.CHINA).format(Date())
            )
            bundle.putString("requestContent", "hello")
            intent.putExtras(bundle)
            resultLauncher.launch(intent)
        }

        findViewById<Button>(R.id.dailBtn).setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_DIAL
            intent.data = Uri.parse("tel:12345")
            startActivity(intent)
        }

        findViewById<Button>(R.id.smsBtn).setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SENDTO
            intent.data = Uri.parse("smsto:12345")
            startActivity(intent)
        }

        findViewById<Button>(R.id.calculatorBtn).setOnClickListener {
            val intent = Intent()
            intent.action = "android.intent.action.calculator"
            intent.addCategory(Intent.CATEGORY_DEFAULT)
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
