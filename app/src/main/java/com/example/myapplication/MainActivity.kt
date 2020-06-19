package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebUrl: String = "file:///android_asset/index1.html"
//        webView.postDelayed({ webView.loadUrl(myWebUrl) }, 500)
       webView.loadUrl(myWebUrl)
    }

}