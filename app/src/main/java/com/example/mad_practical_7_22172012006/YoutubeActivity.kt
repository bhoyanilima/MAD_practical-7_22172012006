package com.example.mad_practical_7_22172012006

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

      val webSettings: WebSettings = YoutubeWebviwe.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        YoutubeWebview.loadurl()


    }
}