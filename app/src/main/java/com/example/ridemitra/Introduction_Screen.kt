package com.example.ridemitra

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ridemitra.databinding.ActivityIntroductionScreenBinding

class Introduction_Screen : AppCompatActivity() {
    private lateinit var binding: ActivityIntroductionScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_introduction_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding=ActivityIntroductionScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Start.setOnClickListener {
            startActivity(Intent(this,login_Page::class.java))
            finish()
        }

    }
}