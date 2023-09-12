package com.example.mad_p7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Youtube : AppCompatActivity() {
    private val webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val webView = findViewById<WebView>(R.id.webviwe)
        webView.webViewClient = WebViewClient()
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
       webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        webView.loadUrl("https://youtube.com/embed/fjn9B64Znrk")
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