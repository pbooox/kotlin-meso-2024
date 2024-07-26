package com.pboox.androidmaster.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pboox.androidmaster.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSaludo = findViewById<Button>(R.id.btnSaludar)
        val btnComponentes = findViewById<Button>(R.id.btnComponentes)

        btnSaludo.setOnClickListener() { navigateToSaludo() }
        btnComponentes.setOnClickListener() { navigateToComponentes() }

    }

    private fun navigateToSaludo() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToComponentes() {
        val intent = Intent(this, ComponentsActivity::class.java)
        startActivity(intent)
    }
}