package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding
    // define o inflete binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            // quando clicado, o código será executado
            val username = binding.editNome.text.toString().trim()
            val password = binding.editSenha.text.toString().trim()

            if (username.equals("Giulia") && password.equals("12")) {
                // caso os dados inseridos não sejam esses, o programa não será acessado.
                val i = Intent(this, MainActivity::class.java)
                i.putExtra("nome", username)
                startActivity(i)
                finish()
            } else {
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
                // se estiver errado, essa mensagem será apresentada
            }
        }

    }
}