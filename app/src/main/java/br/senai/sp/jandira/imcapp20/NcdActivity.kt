package br.senai.sp.jandira.imcapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_ncd.*

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val btnCalcularNcd: Button = findViewById(R.id.button_calcular_ncd)
        val edPeso_ncd: EditText = findViewById(R.id.ed_peso_ncd)

        val idade : Spinner =  findViewById(R.id.idade)
        val nivelDeAtividade : Spinner =  findViewById(R.id.nivel_de_atividade)
        val sexo: RadioGroup =  findViewById(R.id.sexo)

        idade.setSelection(1)
        var faixaEtaria: Int = 0

        btnCalcularNcd.setOnClickListener {
            if(edPeso_ncd.text.isEmpty()){
                edPeso_ncd.error = "Você não informou o seu peso"
            }

            if (edPeso_ncd.text.isNotEmpty()){
                val intent = Intent(this, activity_resultado_ncd ::class.java)

                val peso: Double = edPeso_ncd.text.toString().toDouble()
                intent.putExtra("peso", peso)
                startActivity(intent)


            }

        }

    }
}