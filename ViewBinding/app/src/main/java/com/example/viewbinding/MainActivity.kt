package com.example.viewbinding

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = arrayOf<String?>("item1","item2","item3","item4","item5","item6","item7","item8","item9","item1","item2","item3","item4","item5","item6","item7","item8","item9")

        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1,items)

        binding.listview.adapter = adapter

    }
}