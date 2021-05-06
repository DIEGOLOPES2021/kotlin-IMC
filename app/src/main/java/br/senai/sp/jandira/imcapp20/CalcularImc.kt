package br.senai.sp.jandira.imcapp20

import android.util.Log
import kotlin.math.log

fun calcularImc (peso: Double, altura:Double ) :Double {
    val imc = peso/ (altura*altura)
    return imc
}

fun obterStatus(imc: Double) :List<String>{
    var resultados = emptyList<String>()
    if(imc < 18.5){
        //array       // Log.i("imc", resultados[1])
        resultados = listOf("abaixo do peso","fadida, estresse e anciedade")

    }else if (imc > 18.55 && imc < 25){

        resultados = listOf("peso ideal","menor risco de doencas cardiacas e vasculares")

    } else if (imc >= 25 && imc <30){

        resultados = listOf("Acima do peso","Riscos de má circulacao, fadiga e varises")

    } else if (imc >=30 && imc <35){

        resultados = listOf("Obsidade grau 1","Riscos diabetes, angina, infarto e aterosclerose")

    } else if (imc >=35 && imc < 40 ){

        resultados = listOf("Obsidade grau 2","Riscos apnea do sono e falta de ar")

    } else {

        resultados = listOf("Obsidade grau 3","Riscos de refluxo, mobilidade reduzida, escaras, diabetes, infarto e " +
                "AVC")

    }
    return resultados
}
