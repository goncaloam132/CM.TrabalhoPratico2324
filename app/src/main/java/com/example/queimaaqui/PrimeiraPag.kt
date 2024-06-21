package com.example.queimaaqui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.queimaaqui.databinding.ActivityPrimeiraPagBinding
import com.google.firebase.auth.FirebaseAuth

class PrimeiraPag : AppCompatActivity() {

    private lateinit var binding: ActivityPrimeiraPagBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar o layout usando DataBindingUtil
        binding = ActivityPrimeiraPagBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar o clique nos botões
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}
