package com.example.quizfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}