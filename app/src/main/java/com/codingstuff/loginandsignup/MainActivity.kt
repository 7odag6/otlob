package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingstuff.loginandsignup.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener{
            val intent = Intent (this,PersonalProfile::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener{
            val intent =Intent(this ,SignInActivity::class.java)
            FirebaseAuth.getInstance().signOut();
            startActivity(intent)
        }


    }
}