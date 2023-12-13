package com.example.dicasdefotos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variável  para fazer o botão ir para proxima tela
        val butao = findViewById<Button>(R.id.button_avancar1)


        butao.setOnClickListener{ charSegundoTela()
        }
    }
    //função indincando para onde vai ao clicar no botão
    private fun charSegundoTela() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}