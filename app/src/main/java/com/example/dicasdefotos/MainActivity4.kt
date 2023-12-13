package com.example.dicasdefotos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

//variável  para fazer o botão ir para proxima tela
        val buttonretunScroll = findViewById<Button>(R.id.buttonretunScroll)

        buttonretunScroll.setOnClickListener{ chamarScrol()
        }
    }
    //função indincando para onde vai ao clicar no botão
    private fun chamarScrol() {
        val  intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}