package com.example.servicesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicesexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnstart.setOnClickListener{
                startService(Intent(this@MainActivity, MusicService::class.java))
            }

            btnstop.setOnClickListener{
                stopService(Intent(this@MainActivity, MusicService::class.java))
            }
        }
    }
}