package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //These Booleans are flags to control the onDecimal and onOperator functions
    var lastnumeric = false
    var lastdot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater) //view binding
        setContentView(binding.root)





    }

    fun onDigit(view: View) {
        binding.tvinput.append((view as Button).text)
        lastnumeric = true
    }
    fun onEqual(view: View) {
    }

    fun onDecimalPoint(view: View) {
        if(lastnumeric && !lastdot){
            binding.tvinput.append(".")
            lastnumeric = false
            lastdot = true
        }
    }

    fun onOperator(view: View) {
        if (lastnumeric && !isOperatorAdded(binding.tvinput.text.toString())){
            binding.tvinput.append((view as Button).text)
            lastnumeric = false
            lastdot = false
        }
    }

    fun onClear(view: View) {
        binding.tvinput.text=""
        lastdot = false
        lastnumeric = false
    }

    private fun isOperatorAdded(value: String): Boolean{
        return if (binding.tvinput.text.contains("-")){
            false
        }else{
            value.contains("/") || value.contains("*") || value.contains("+") || value.contains("-")
        }
    }
}