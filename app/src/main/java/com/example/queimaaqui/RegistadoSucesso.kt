package com.example.queimaaqui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.queimaaqui.databinding.ActivityLoginBinding
import com.example.queimaaqui.databinding.ActivityRegistadoSucessoBinding
import com.google.firebase.auth.FirebaseAuth

class RegistadoSucesso : AppCompatActivity() {

    private lateinit var binding: ActivityRegistadoSucessoBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityRegistadoSucessoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnContinuar.setOnClickListener {
            val intent = Intent(this,   Login::class.java)
            startActivity(intent)
        }




        }
    }
