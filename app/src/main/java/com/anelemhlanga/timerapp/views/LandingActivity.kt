package com.anelemhlanga.timerapp.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.anelemhlanga.timerapp.R


class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)


        Handler().postDelayed({
            val intent = Intent(this, TimerActivity::class.java)
            startActivity(intent);

        }, 3000);
    }
}
