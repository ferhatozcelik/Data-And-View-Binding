package com.ferhatozcelik.dataandviewbinding

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var dataBindingButton:Button
    private lateinit var viewBindingButton:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBindingButton = findViewById(R.id.data_binding_button)
        viewBindingButton = findViewById(R.id.view_binding_button)

        dataBindingButton.setOnClickListener {
            startActivity(Intent(this, DataBindingActivity::class.java))
        }
        viewBindingButton.setOnClickListener {
            startActivity(Intent(this, ViewBindingActivity::class.java))
        }

    }
}