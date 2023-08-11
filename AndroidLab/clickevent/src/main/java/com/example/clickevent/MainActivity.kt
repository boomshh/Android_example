package com.example.clickevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {

    var pauseTime = 0L

    lateinit var startButton: Button
    lateinit var stopButton: Button
    lateinit var resetButton: Button
    lateinit var chronometer: Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.btn1)
        stopButton = findViewById(R.id.btn2)
        resetButton = findViewById(R.id.btn3)
        chronometer = findViewById(R.id.timer)

        startButton.setOnClickListener {
            chronometer.base = SystemClock.elapsedRealtime() + pauseTime
            chronometer.start()
            stopButton.isEnabled=true
            resetButton.isEnabled=true
            startButton.isEnabled=false
        }
        stopButton.setOnClickListener {
            pauseTime= chronometer.base - SystemClock.elapsedRealtime()
            chronometer.stop()
            stopButton.isEnabled=false
            resetButton.isEnabled=true
            startButton.isEnabled=true
        }
        resetButton.setOnClickListener {
            pauseTime = 0L
            chronometer.base = SystemClock.elapsedRealtime()
            chronometer.stop()
            stopButton.isEnabled=false
            resetButton.isEnabled=false
            startButton.isEnabled=true
        }
    }
}