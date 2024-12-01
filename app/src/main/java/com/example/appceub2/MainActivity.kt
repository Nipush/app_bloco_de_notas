package com.example.appceub2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, NoteMainActivity::class.java)
        Toast.makeText(this, "Abrindo app de notas", Toast.LENGTH_SHORT).show()
        startActivity(intent)
        finish()
    }
}
