package com.example.intinyatugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Registrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)
        val backbtn = findViewById<Button>(R.id.Register)
        backbtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
            finish()

        }
    }
}