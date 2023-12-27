package com.example.gasagencycartapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addCartButton : ImageButton = findViewById(R.id.imageButtonGasCart)
        val gasCartIntent = Intent(this, GasAgencyCartActivity::class.java)
        addCartButton.setOnClickListener {
            startActivity(gasCartIntent)
        }


    }
}