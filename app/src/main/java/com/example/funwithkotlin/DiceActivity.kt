package com.example.funwithkotlin

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
class DiceActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        // Get the Button view from the layout and assign a click
        // listener to it.
        val rollButton: Button = findViewById(R.id.button)
        val resetButton: Button = findViewById(R.id.resetButton)
        rollButton.setOnClickListener { rollDice() }
        resetButton.setOnClickListener{ resetImage() }
        diceImage = findViewById(R.id.imageView)
        diceImage2 = findViewById(R.id.imageView2)
    }

    /**
     * Click listener for the Roll button.
     */
    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
    private fun resetImage() {
        diceImage.setImageResource(R.drawable.dice_1)
        diceImage2.setImageResource(R.drawable.dice_6)
    }
}