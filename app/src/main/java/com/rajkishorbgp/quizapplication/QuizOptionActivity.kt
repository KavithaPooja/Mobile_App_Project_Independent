package com.rajkishorbgp.quizapplication

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.view.MenuItem
import com.rajkishorbgp.quizapplication.databinding.ActivityQuizOptionBinding

class QuizOptionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizOptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityQuizOptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Quiz"
        supportActionBar?.title?.let {
            val spannableString = SpannableString(it)
            spannableString.setSpan(StyleSpan(Typeface.BOLD), 0, it.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            supportActionBar?.title = spannableString
        }

        binding.mathCardView.setOnClickListener {
            startActivity(Intent(this@QuizOptionActivity,MathQuizActivity::class.java))
        }

        binding.cLanguageCardView.setOnClickListener {
            startActivity(Intent(this@QuizOptionActivity,C_Language_Activity::class.java))
        }

        binding.spaceScienceCardView.setOnClickListener {
            startActivity(Intent(this@QuizOptionActivity,SpaceScienceActivity::class.java))
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}