package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val twoPlayers = findViewById<Button>(R.id.twoPlayers)
        twoPlayers.setOnClickListener {
            val intent = Intent(this, NameInput::class.java)
            startActivity(intent)
        }

        val playerVsCpu = findViewById<Button>(R.id.playerVsCpu)
        playerVsCpu.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }


    }
}