package com.ferhatozcelik.dataandviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferhatozcelik.dataandviewbinding.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.updateButton.setOnClickListener {
            val message = "Button clicked!"
            binding.messageTextView.text = message
        }
    }
}
