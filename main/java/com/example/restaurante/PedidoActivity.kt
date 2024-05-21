package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        // quantidades de pizza, salada e hambúrguer que foram passados na tela anterior.
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

        val texto = "Resumo do Pedido\n" +
                // apresenta o resumo da parte acima
                "Pizza: $quantidadePizza Preço:R$ ${quantidadePizza*8}\n" +
                "Salada: $quantidadeSalada Preço:R$ ${quantidadeSalada*10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço:R$ ${quantidadeHamburguer*12}\n"

        binding.textResumo.text = texto
    }

}