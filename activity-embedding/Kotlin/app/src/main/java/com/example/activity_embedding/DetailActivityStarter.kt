package com.example.activity_embedding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class DetailActivityStarter : AppCompatActivity() {
    override fun onResume() {
        super.onResume()
        val intent = intent
        intent.apply {
            setClass(this@DetailActivityStarter, DetailActivity::class.java)
            flags = Intent.FLAG_ACTIVITY_NO_HISTORY or
                    Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        startActivity(intent)
        finish()
    }
}