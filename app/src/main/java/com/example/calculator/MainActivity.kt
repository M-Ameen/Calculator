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

    var lastnumeric = false
    var lastdot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
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

    fun onOperator(view: View) {}

    fun onClear(view: View) {
        binding.tvinput.text=""
        lastdot = false
        lastnumeric = false
    }
}