package com.chloeadr.buildadroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_custom.*
import kotlinx.android.synthetic.main.activity_clicker.*
import kotlinx.android.synthetic.main.activity_clicker.settings

class CustomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)

        basic.setOnClickListener{
            val intent = Intent(this, ClickerActivity::class.java)
            intent.putExtra("droid", "basic")
            startActivity(intent)
        }

        fantasia.setOnClickListener{
            val intent = Intent(this, ClickerActivity::class.java)
            intent.putExtra("droid", "fantasia")
            startActivity(intent)
        }

        yoda.setOnClickListener{
            val intent = Intent(this, ClickerActivity::class.java)
            intent.putExtra("droid", "yoda")
            startActivity(intent)
        }

        mickey.setOnClickListener{
            val intent = Intent(this, ClickerActivity::class.java)
            intent.putExtra("droid", "mickey")
            startActivity(intent)
        }
    }
}