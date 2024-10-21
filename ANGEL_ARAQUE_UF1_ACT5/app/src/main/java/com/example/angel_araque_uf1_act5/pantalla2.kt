package com.example.angel_araque_uf1_act5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)


            startActivity(intent)
        }
    }
}