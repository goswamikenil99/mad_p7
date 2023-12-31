package com.example.mad_p7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class Youtube : AppCompatActivity() {
    private val webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val webView = findViewById<WebView>(R.id.webviwe)
        val y_id="fJn9B64Znrk"
        val webSettings:WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
       webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        webView.loadUrl("https://www.youtube.com/embed/$y_id")
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
}