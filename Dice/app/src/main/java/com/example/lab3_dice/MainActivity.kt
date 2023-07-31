package com.example.lab3_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_number = findViewById<TextView>(R.id.tv_number)
        val btn_roll = findViewById<Button>(R.id.btn_roll)

        btn_roll.setOnClickListener {
            val random = Random()
            val num = random.nextInt(6) + 1

            tv_number.text = num.toString()
        }
    }
}