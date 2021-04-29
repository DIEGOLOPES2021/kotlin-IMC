package br.senai.sp.jandira.imcapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoDoOmcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_do_omc)


        val txtImc: TextView = findViewById(R.id.text_view_imc)
        val txtStatus: TextView = findViewById(R.id.text_view_status)

        //pegando o valor da outra pagina e recebe nessa /ImcActivery.kit

        val peso = intent.getDoubleExtra("peso", 0.0)
        val altura = intent.getDoubleExtra("altura", 0.0)

        //formatado para aparecer apenas o valor com duas casas decimais
        val imc = calcularImc(peso, altura)

        txtImc.text = String.format("%.2f", imc)
        txtStatus.text = obterStatus(imc)


    }
}