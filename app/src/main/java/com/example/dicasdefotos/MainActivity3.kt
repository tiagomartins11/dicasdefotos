package com.example.dicasdefotos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
//variável  para fazer o botão ir para proxima tela
        val button1 = findViewById<Button>(R.id.buttonReturnParaScrol)



        button1.setOnClickListener{ chamarscrol()
        }

    }
    //função indincando para onde vai ao clicar no botão
    private fun chamarscrol() {
        val  intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }


}