package com.example.uibasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_views)

//       fun doAction(v:View) {
//           Toast.makeText(getApplicationContext(), "Submitted Successfully",
//               Toast.LENGTH_SHORT).show();
//       }

        val btn = findViewById<Button>(R.id.submit_button)

        btn.setOnClickListener {
            Toast.makeText(this, "Submited Successfully", Toast.LENGTH_SHORT).show()
        }
    }
}