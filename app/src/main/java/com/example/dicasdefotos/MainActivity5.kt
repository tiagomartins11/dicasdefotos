package com.example.dicasdefotos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val buttonretunScrolle = findViewById<Button>(R.id.button)

        buttonretunScrolle.setOnClickListener{ chamarScrol()
        }
    }

    private fun chamarScrol() {
        val  intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}