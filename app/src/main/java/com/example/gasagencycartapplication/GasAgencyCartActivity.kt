package com.example.gasagencycartapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class GasAgencyCartActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiy_gas_bottle_cart)

        val editText9KGs: EditText = findViewById(R.id.editTextNumberSigned9KGs)
        val editText19KGs: EditText = findViewById(R.id.editTextNumberSigned19KGs)
        val editText47KGs: EditText = findViewById(R.id.editTextNumberSigned47KGs)
        val editText425KGs: EditText = findViewById(R.id.editTextNumberSigned425KGs)
        val buttonSubmit: Button = findViewById(R.id.submitButton)

        buttonSubmit.setOnClickListener {
            println("Fucking works")
        }
    }
}
