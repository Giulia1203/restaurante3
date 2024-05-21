package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    // é um ponto de interfase importante para definir a conectividade do usuário
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //demostra o layout

        Handler(Looper.getMainLooper()).postDelayed({
            // vai ser demostrado depois de um intervalo de tempo específico
            val i = intent
            //pega os dados recebidos pelo intent splash
            val j = Intent(this,PedidoActivity::class.java)
            // cria um intent para o pedido
            j.putExtras(i)
            startActivity(j)
            // inicia uma nova janela
        },2000)

    }
}