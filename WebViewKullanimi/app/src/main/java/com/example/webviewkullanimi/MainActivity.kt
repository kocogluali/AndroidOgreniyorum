package com.example.webviewkullanimi

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.annotation.RequiresApi
import com.example.webviewkullanimi.databinding.ActivityMainBinding
import java.util.Base64

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding.webView.loadUrl("https://www.google.com.tr")
        val unencodedHtml= "<html><body>'%23' is the percent code for ‘#‘ </body></html>";
        val encodedHtml = Base64.getEncoder().encodeToString(unencodedHtml.toByteArray())
        binding.webView.loadData(encodedHtml, "text/html", "base64")




    }
}