package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class NameInput : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextName2: EditText
    private lateinit var StartButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_input)
        title = "Input Player names"

        editTextName = findViewById(R.id.editTextName)
        editTextName2 = findViewById(R.id.editTextName2)
        StartButton = findViewById(R.id.StartButton)

        StartButton.setOnClickListener{

            val name1 = editTextName.text.toString()
            val name2 = editTextName2.text.toString()

            val intent = Intent(this, GameActivity::class.java)
            intent.putExtra("Key1", name1)
            intent.putExtra("Key2", name2)

            startActivity(intent)
        }

        val button = findViewById<Button>(R.id.StartButton)
        button.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
    }

}