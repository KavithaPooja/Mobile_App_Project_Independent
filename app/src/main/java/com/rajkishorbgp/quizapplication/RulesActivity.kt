package com.rajkishorbgp.quizapplication

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.rajkishorbgp.quizapplication.databinding.ActivityRulesBinding


class RulesActivity : AppCompatActivity() {
    lateinit var binding: ActivityRulesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRulesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Rules"
        supportActionBar?.title?.let {
            val spannableString = SpannableString(it)
            spannableString.setSpan(StyleSpan(Typeface.BOLD), 0, it.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            supportActionBar?.title = spannableString
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}