package com.example.shared

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shared.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("my_pref", Context.MODE_PRIVATE)

        binding.save.setOnClickListener {
            sharedPref.edit().run {
                putString("data1", binding.edit.text.toString())
                putBoolean("data2", binding.check.isChecked)
                commit()
            }
        }
        binding.get.setOnClickListener {
            val data1 = sharedPref.getString("data1", "none")
            val data2 = sharedPref.getBoolean("data2", false)
            binding.result.text = "data1: $data1, data2: $data2"
        }
    }
}