package dev.Misky.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent= Intent(this,logInActivity::class.java)
        startActivity(intent)
        finish()

    }
}