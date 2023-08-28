package com.rajkishorbgp.quizapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class HistoryActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        findViewById<TextView>(R.id.historyText).text = "Exploring Raj Kishor Quiz Journey\n" +
                "\n" +
                "Welcome, Raj Kishor, to the \"History\" section of the Quiz App! This is where you can trace and reflect upon your unique quiz journey. Here's a tailored experience just for you:\n" +
                "\n" +
                "1. Your Quiz History Overview:\n" +
                "Here, you'll find a personalized summary of all the quizzes you've taken thus far. Gain insights into your achievements and progress.\n" +
                "\n" +
                "2. Revisiting Your Quizzes:\n" +
                "- Dive into the details of each quiz you've attempted.\n" +
                "- Reflect on the questions you answered correctly and those that posed a challenge.\n" +
                "- Engage with the feedback and performance summary for each quiz.\n" +
                "\n" +
                "3. Tracking Your Progress:\n" +
                "- Keep tabs on your overall advancement within the app.\n" +
                "- Visualize how many quizzes you've triumphantly conquered and how many are yet to be conquered.\n" +
                "\n" +
                "4. Elevating Your Scores:\n" +
                "- Should you desire to enhance your scores, take another shot at quizzes that didn't meet the passing mark initially.\n" +
                "- Embrace the opportunity to learn from your experiences and make progress.\n" +
                "\n" +
                "5. Showcasing Achievements:\n" +
                "- As you clear each quiz, a certificate of achievement shall grace your collection.\n" +
                "- These certificates embody your dedication to growth and improvement.\n" +
                "\n" +
                "6. Personalized Goals:\n" +
                "- Within this realm, you can set objectives for yourself.\n" +
                "- Challenge yourself to elevate scores or embrace new realms of knowledge.\n" +
                "\n" +
                "7. Acknowledging Your Journey:\n" +
                "- Celebrate your journey of learning and growth with us.\n" +
                "- This history section is a testament to your ongoing commitment to self-betterment.\n" +
                "\n" +
                "8. Feedback and Enrichment:\n" +
                "- Should you wish to share your insights or voice suggestions, we're all ears.\n" +
                "- Together, we can refine and elevate your quiz experience.\n" +
                "\n" +
                "9. Embark on Your Learning Odyssey:\n" +
                "- Learning is a voyage of excitement and discovery.\n" +
                "- Unleash your curiosity and thrive on the satisfaction of broadening your horizons.\n" +
                "\n" +
                "10. Heartfelt Gratitude:\n" +
                "    - We're thrilled to have you as a part of the Quiz App journey.\n" +
                "    - Your commitment to growth is an inspiration to us all.\n" +

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}