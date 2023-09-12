package com.example.save

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.save.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.save.setOnClickListener {
            saveData()
            Toast.makeText(this, "data saved", Toast.LENGTH_SHORT).show()
        }
        loadData()
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit()
        edit.putString("name", binding.edit.text.toString())
        edit.apply()
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref", 0)
        binding.edit.setText(pref.getString("name", ""))
    }
}