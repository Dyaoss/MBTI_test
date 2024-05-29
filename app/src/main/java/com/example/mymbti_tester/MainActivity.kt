package com.android.mymbti_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val btn_start = findViewById<ImageView>(R.id.iv_start)
        btn_start.setOnClickListener {
            val intent = Intent(this@MainActivity, TestActivity::class.java)
            startActivity(intent)
        }
    }
}