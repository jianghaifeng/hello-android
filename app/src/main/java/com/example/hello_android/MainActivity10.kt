package com.example.hello_android

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity10 : AppCompatActivity() {

    private lateinit var resultView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val btn = findViewById<Button>(R.id.btn)
        resultView = findViewById(R.id.tv_result)
        btn.setOnClickListener(::onBtnClick)
        btn.setOnLongClickListener(::onBtnLongClick)

        val enableBtn = findViewById<Button>(R.id.enableBtn)
        val disableBtn = findViewById<Button>(R.id.disableBtn)
        enableBtn.setOnClickListener { _ -> btn.isEnabled = true }
        disableBtn.setOnClickListener { _ -> btn.isEnabled = false }
//        btn.setOnClickListener { view ->
//            tvResult.text =
//                String.format(
//                    "%s clicked at : %s", (view as Button).text,
//                    SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(Date())
//                )
//        }
    }

    private fun onBtnLongClick(view: View?): Boolean {
        resultView.text = String.format(
            "%s Long clicked at : %s", (view as Button).text,
            SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(Date())
        )
        return true
    }

    private fun onBtnClick(view: View) {
        resultView.text = String.format(
            "%s clicked at : %s", (view as Button).text,
            SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(Date())
        )
    }
}


