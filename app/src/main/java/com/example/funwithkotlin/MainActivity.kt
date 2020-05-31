package com.example.funwithkotlin

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView


//this app has some core features like
// 1. Login And logout
//2. Animation
//3.Material Design

class MainActivity : AppCompatActivity() {

    private lateinit var android: ImageView
    private lateinit var diceButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android = findViewById(R.id.imageView)
        diceButton = findViewById(R.id.diceButton)

        //Animation
        val animator = ObjectAnimator.ofFloat(android, View.ROTATION, -360f, 0f)
        animator.duration = 1000
        animator.start()

        //Dice Roller app
        diceButton.setOnClickListener()
        {
            intent = Intent(this, DiceActivity::class.java)
            startActivity(intent)
        }
    }

    //creating menu for about me section

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_about -> {
                intent = Intent(this, AboutMeActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
