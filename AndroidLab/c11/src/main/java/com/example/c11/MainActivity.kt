package com.example.c11

import android.graphics.Typeface
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat
import org.w3c.dom.Text



class MainActivity : AppCompatActivity() {

    lateinit var visiblaButton: Button
    lateinit var invisibleButton : Button
    lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        visiblaButton = findViewById(R.id.btn1)
        invisibleButton = findViewById(R.id.btn2)
        imageView = findViewById(R.id.image1)

        visiblaButton.setOnClickListener {
            imageView.visibility = View.VISIBLE
        }
        invisibleButton.setOnClickListener {
            imageView.visibility = View.GONE
        }
    }
}