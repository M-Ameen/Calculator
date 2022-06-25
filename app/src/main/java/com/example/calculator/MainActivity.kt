package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View) {
        Toast.makeText(getApplicationContext(), "onDigit Is Executed", Toast.LENGTH_SHORT).show()
    }
    fun onEqual(view: View) {}
    fun onOperator(view: View) {}
    fun onDecimalPoint(view: View) {}
    fun onClear(view: View) {}
}