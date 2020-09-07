package com.example.continuadayoshi_1sprint

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //sei que poderia ter armazenado os valores em variáveis e printar a frase a apenas uma vez
    // mas quando parei para reparar nisso já estava um tanto tarde e eu estava bem cansado

        fun calcularDescontos(componente:View){
            val nomeUsuario = et_nomeUsuario.text
            val salarioBruto = et_salarioBruto.text.toString().toDouble()
            val descontos = et_descontos.text.toString().toDouble()


            if(nomeUsuario == null){tv_resultado.setText("Meu caro digite seu nome Agora")}

            else{
                if(salarioBruto <= 0.0 || descontos <= 0.0 && descontos <= 0){
                    tv_resultado.visibility = View.VISIBLE
                    tv_resultado.setTextColor(Color.RED)
                    tv_resultado.setText("Meu caro digite um valor maior que 0 por favor !")
                } else if(salarioBruto <= 1039.0){
                    tv_resultado.visibility = View.VISIBLE
                    tv_resultado.setTextColor(Color.GREEN)
                    tv_resultado.setText(
                        "${nomeUsuario}, o desconto de INSS do seu salário é de 7,5%," +
                                " e seus descontos são de R$${descontos}, totalizando R$${(0.075 * salarioBruto) + descontos}" +
                                " de descontos e sobrando R$${salarioBruto - ((0.075 * salarioBruto) + descontos)}")
                }else if(salarioBruto > 1039.0 && salarioBruto <= 2098.60 ){
                    tv_resultado.visibility = View.VISIBLE
                    tv_resultado.setTextColor(Color.BLUE)
                    tv_resultado.setText(
                        "${nomeUsuario}, o desconto de INSS do seu salário é de 9,0%," +
                                " e seus descontos são de R$${descontos}, totalizando R$${(0.090 * salarioBruto) + descontos}" +
                                " de descontos e sobrando R$${salarioBruto - ((0.090 * salarioBruto) + descontos)}")
                }else if(salarioBruto > 2098.60 && salarioBruto <= 3134.40 ){
                    tv_resultado.visibility = View.VISIBLE
                    tv_resultado.setTextColor(Color.MAGENTA)
                    tv_resultado.setText(
                        "${nomeUsuario}, o desconto de INSS do seu salário é de 12,0%," +
                                " e seus descontos são de R$${descontos}, totalizando R$${(0.12 * salarioBruto) + descontos}" +
                                " de descontos e sobrando R$${salarioBruto - ((0.12 * salarioBruto) + descontos)}")
                }
                else if(salarioBruto > 3134.40 && salarioBruto <= 6101.06 ){
                    tv_resultado.visibility = View.VISIBLE
                    tv_resultado.setTextColor(Color.GREEN)
                    tv_resultado.setText(
                        "${nomeUsuario}, o desconto de INSS do seu salário é de 14,0%," +
                                " e seus descontos são de R$${descontos}, totalizando R$${(0.14 * salarioBruto) + descontos}" +
                                " de descontos e sobrando R$${salarioBruto - ((0.14 * salarioBruto) + descontos)}")
                }else{
                    tv_resultado.visibility = View.VISIBLE
                    tv_resultado.setTextColor(Color.RED)
                    tv_resultado.setText(
                        "${nomeUsuario}, o desconto de INSS do seu salário é de R$713,09" +
                                " e seus descontos são de R$${descontos}, totalizando R$${713.09 + descontos}" +
                                " de descontos e sobrando R$${salarioBruto - (713.09 + descontos)}")
                }
                }
            }
}


