package com.example.gasagencycartapplication

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.content.Intent

import com.hbb20.CountryCodePicker

class LoginPhoneNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number);

        val countryCodePicker : CountryCodePicker= findViewById(R.id.login_countrycode);
        val phoneInput : EditText = findViewById(R.id.login_mobile_number);
        val sendOtpBtn : Button= findViewById(R.id.send_otp_btn);
        val progressBar : ProgressBar = findViewById(R.id.login_progress_bar);

        progressBar.visibility = View.GONE

        countryCodePicker.registerCarrierNumberEditText(phoneInput);

        sendOtpBtn.setOnClickListener {
            if(!countryCodePicker.isValidFullNumber){
                phoneInput.error = "Phone number not valid"
                return@setOnClickListener;
            }
            intent = Intent(this, LoginOtpActivity::class.java)
            intent.putExtra("phone",countryCodePicker.fullNumberWithPlus);
            startActivity(intent);
        }

    }


}