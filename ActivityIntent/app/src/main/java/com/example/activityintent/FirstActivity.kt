package com.example.activityintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val btn_call3 = findViewById<Button>(R.id.ThirdActivity)
        btn_call3.setOnClickListener {
            val edit_text = findViewById<EditText>(R.id.edit_data)
            val strData = edit_text.text.toString()

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("dataFromFirstActivity",strData)
            startActivity(intent)
        }


    }
    fun doOnBtnClick(view: View) {
        when(view.getId()) {
            R.id.dialActivity -> {
                val call_intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"))
                startActivity(call_intent)
            }
            R.id.mapActivity -> {
                val map_intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.565350, 127.01445"))
                startActivity(map_intent)
            }
        }
    }
}