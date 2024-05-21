package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        // inflamos o layout da atividade

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val username = intent.extras?.getString("username")
        // valor da variável "username" em String

        if(!username.isNullOrEmpty()){
            binding.textOla.setText("Olá $username")
            // se o "if" estiver sendo usado corretamente, irá aparecer uma mensagem de acordo com as
            // condições dele.
        }

        binding.buttonFechar.setOnClickListener {
            finishAffinity()
            // botão para encerrar e passar para a próxima página
        }

        binding.buttonPedir.setOnClickListener {
            val i = Intent(this, SplashActivity::class.java)
            // dados levados para o intent splash
            i.putExtra("quantidadePizza", binding.editQuantidadePizza.toString())
            i.putExtra("quantidadeSalada", binding.editQuantidadeSalada.toString())
            i.putExtra("quantidadeHamburguer", binding.editQuantidadeHamburguer.toString())
            startActivity(i)
            // abre nova tela
            finish()
            // botão para pedir e passar para a próxima página
        }


        binding.checkPizza.setOnClickListener {
            if(binding.checkPizza.isChecked()){
                //ajusta a visibilidade e quantidade da pizza
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            }else{
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        binding.checkSalada.setOnClickListener {
            if(binding.checkSalada.isChecked()){
                //ajusta a visibilidade e quantidade da salada
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            }else{
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        binding.checkHamburger.setOnClickListener {
            if(binding.checkHamburger.isChecked()){
                //ajusta a visibilidade e quantidade do hamburguer
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            }else{
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }

    }
}