package com.rajkishorbgp.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.rajkishorbgp.quizapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startQuizCard.setOnClickListener {
            startActivity(Intent(this@MainActivity,QuizOptionActivity::class.java))
        }

        binding.rulesCard.setOnClickListener {
            startActivity(Intent(this@MainActivity,RulesActivity::class.java))
        }

        binding.historyCard.setOnClickListener {
            startActivity(Intent(this@MainActivity,HistoryActivity::class.java))
        }

        binding.editPasswordCard.setOnClickListener {
            startActivity(Intent(this@MainActivity,EditPasswordActivity::class.java))
        }
        binding.logoutCard.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Log out!",Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}