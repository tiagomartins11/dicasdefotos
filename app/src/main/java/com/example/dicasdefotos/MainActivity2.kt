package com.example.dicasdefotos


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //variáveis para fazer o botão ir para proxima tela
        val button1 = findViewById<Button>(R.id.button1)
        val buttonReturn = findViewById<Button>(R.id.buttonReturn)
        val button2 = findViewById<Button>(R.id.button2)
        val buttonrrdicao = findViewById<Button>(R.id.button3)



        button1.setOnClickListener{ chamarTerceiratela()
        }
        buttonReturn.setOnClickListener{chamarPrimeiraTela()
        }
        button2.setOnClickListener{ chamarDicasFotos()
        }
        buttonrrdicao.setOnClickListener{ chamarTelaEdicao()
        }

    }




    //funções indincando para onde vai ao clicar nós botões
    private fun chamarTelaEdicao() {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }

    private fun chamarPrimeiraTela() {
        val  intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun chamarTerceiratela() {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

    private fun chamarDicasFotos() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

}

