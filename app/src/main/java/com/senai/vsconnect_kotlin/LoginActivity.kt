package com.senai.vsconnect_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.senai.vsconnect_kotlin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    //É uma propriedade privada  como o nome binding do tipo ActivityLoginBinding
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}