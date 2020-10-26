package com.chloeadr.buildadroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_clicker.*

class ClickerActivity : AppCompatActivity() {
    var score = 0
    var level = 1

    fun displayScore() {
        if (score<=1) {
            scoreText.text = "" + score + " credit"
        } else {
            scoreText.text = "" + score + " credits"
        }

        levelText.text = "Level " + level
    }

    fun hideButton() {
        if (score<30) {
            buttonLevel.visibility = View.INVISIBLE
        } else {
            buttonLevel.visibility = View.VISIBLE
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicker)

        val droid = intent.extras?.getString("droid")

        if(droid=="basic") {
            bb8.setImageResource(R.drawable.bb8);
        } else if(droid=="fantasia") {
            bb8.setImageResource(R.drawable.bb8withfantasiahat);
        } else if(droid=="yoda") {
            bb8.setImageResource(R.drawable.bb8yoda);
        } else if(droid=="mickey") {
            bb8.setImageResource(R.drawable.bb8withmickeyears);
        }


        bb8.setOnClickListener {
            score += level
            displayScore()
            hideButton()
        }

        buttonLevel.setOnClickListener {
            score -= 30
            level += 1
            displayScore()
            hideButton()
        }

        reset.setOnClickListener {
            score = 0
            level = 1
            displayScore()
            hideButton()
        }

        settings.setOnClickListener{
            val intent = Intent(this, CustomActivity::class.java)
            startActivity(intent)
        }
    }
}