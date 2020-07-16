package com.shouse.UI

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.shouse.R
import com.shouse.UI.Auth.LoginActivity

class SplashScreen : AppCompatActivity() {
    lateinit var  handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        },3000) // Activity will change after 3 sec
    }
}
