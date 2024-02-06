package com.example.cardapio_online

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import com.example.cardapio_online.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    var total: Float  = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPagar.setOnClickListener(this)

    }

    override fun onClick(view: View) {

        //Botão Pagar
        if (view.id == R.id.btn_pagar){
            binding.txtValor.text = "R$ 0"
            total = 0.0f

            //Entradas
            if (binding.checkEntr1.isChecked()){
                binding.checkEntr1.setChecked(false)
            }
            if (binding.checkEntr2.isChecked()){
                binding.checkEntr2.setChecked(false)
            }

            //Pratos Principais
            if (binding.checkPrato1.isChecked()){
                binding.checkPrato1.setChecked(false)
            }
            if (binding.checkPrato2.isChecked()){
                binding.checkPrato2.setChecked(false)
            }
            if (binding.checkPrato3.isChecked()){
                binding.checkPrato3.setChecked(false)
            }
            if (binding.checkPrato4.isChecked()){
                binding.checkPrato4.setChecked(false)
            }

            //Bebidas
            if (binding.checkBebida1.isChecked()){
                binding.checkBebida1.setChecked(false)
            }
            if (binding.checkBebida2.isChecked()){
                binding.checkBebida2.setChecked(false)
            }
            if (binding.checkBebida3.isChecked()){
                binding.checkBebida3.setChecked(false)
            }

            //Sobremesas
            if (binding.checkSobremesa1.isChecked()){
                binding.checkSobremesa1.setChecked(false)
            }
            if (binding.checkSobremesa2.isChecked()){
                binding.checkSobremesa2.setChecked(false)
            }

            Toast.makeText(this, "Sua conta foi paga. Aguarde seu pedido!", Toast.LENGTH_LONG).show()

        }
    }

    fun onCheckboxClicked(view: View) {

        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            if(checked == view.isChecked){
                when (view.id) {
                    R.id.check_entr_1 -> {
                        if (checked) {
                            total += 25.9f
                        } else {
                            total -= 25.9f
                        }
                    }
                    R.id.check_entr_2 -> {
                        if (checked) {
                            total += 29.9f
                        } else {
                            total -= 29.9f
                        }
                    }
                    R.id.check_prato_1 -> {
                        if (checked) {
                            total += 22.9f
                        } else {
                            total -= 22.9f
                        }
                    }
                    R.id.check_prato_2 -> {
                        if (checked) {
                            total += 39.9f
                        } else {
                            total -= 39.9f
                        }
                    }
                    R.id.check_prato_3 -> {
                        if (checked) {
                            total += 42.9f
                        } else {
                            total -= 42.9f
                        }
                    }
                    R.id.check_prato_4 -> {
                        if (checked) {
                            total += 27.9f
                        } else {
                            total -= 27.9f
                        }
                    }
                    R.id.check_bebida_1 -> {
                        if (checked) {
                            total += 7.9f
                        } else {
                            total -= 7.9f
                        }
                    }
                    R.id.check_bebida_2 -> {
                        if (checked) {
                            total += 7.9f
                        } else {
                            total -= 7.9f
                        }
                    }
                    R.id.check_bebida_3 -> {
                        if (checked) {
                            total += 8.9f
                        } else {
                            total -= 8.9f
                        }
                    }
                    R.id.check_sobremesa_1 -> {
                        if (checked) {
                            total += 19.9f
                        } else {
                            total -= 19.9f
                        }
                    }
                    R.id.check_sobremesa_2 -> {
                        if (checked) {
                            total += 15.9f
                        } else {
                            total -= 15.9f
                        }
                    }
                }
                binding.txtValor.text = "R$ ${"%.2f".format(total)}"

            }else{

                total = 0.0f
                binding.txtValor.text = "R$ 0"

            }

        }
    }

}