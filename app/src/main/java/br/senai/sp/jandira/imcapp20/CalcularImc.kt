package br.senai.sp.jandira.imcapp20

fun calcularImc (peso: Double, altura:Double ) :Double {
    val imc = peso/ (altura*altura)
    return imc
}

fun obterStatus(imc: Double) :String{
    if(imc < 18.5){
        return "abaixo do peso"
    }else if (imc > 18.55 && imc < 25){
        return "peso ideal"
    } else if (imc >= 25 && imc <30){
        return "Acima do Peso"
    } else if (imc >=30 && imc <35){
        return "Obesidade nivel 1"
    } else if (imc >=35 && imc < 40 ){
        return "obesidade nivel 2"
    } else {
        return " Obesidade nivel 3"
    }
}
