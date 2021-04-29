package br.senai.sp.jandira.imcapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_imc.view.*

class ImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        //criando o buttn

        val btnCalcular: Button = findViewById(R.id.button_calcular_imc)
        val edPeso: EditText = findViewById(R.id.ed_peso)
        val edAltura : EditText = findViewById(R.id.ed_altura)

        //redirecionando para a outra pagina
        btnCalcular.setOnClickListener {

            if(edPeso.text.isEmpty()){
                edPeso.error = "Você não informou o seu peso"
            }
            if (edAltura.text.isEmpty()){
                edAltura.error = "Você não informou o sea altura"
            }
            if(edPeso.text.isNotEmpty()&& edAltura.text.isNotEmpty()) {
                val intent = Intent(this, ResultadoDoOmcActivity::class.java)
                //convertando essa String para double
                val peso: Double = edPeso.text.toString().toDouble()
                val altura: Double = edAltura.text.toString().toDouble()

                //ta mandando para a outra pagina os valores
                intent.putExtra("peso", peso)
                intent.putExtra("altura", altura)
                startActivity(intent)
            }
        }
    }
}