package com.example.hello_android

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        findViewById<ImageView>(R.id.back).setOnClickListener(this)

        val bundle = intent.extras as Bundle
        findViewById<TextView>(R.id.receiveText).text =
            "requestTime:${bundle.getString("requestTime")}\nrequestContent:${bundle.getString("requestContent")}"
    }

    override fun onClick(v: View?) {
        var bundle = Bundle()
        bundle.putString("response_time", SimpleDateFormat("y-MM-dd hh:mm:ss", Locale.CHINA).format(Date()))
        bundle.putString("response_content", "你好")
        var intent = Intent()
        intent.putExtras(bundle)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}