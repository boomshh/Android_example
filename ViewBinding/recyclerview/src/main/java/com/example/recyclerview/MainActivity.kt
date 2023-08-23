package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = mutableListOf<MyItem>()
        dataList.add(MyItem(R.drawable.ex1, "Bella", "1"))
        dataList.add(MyItem(R.drawable.ex2, "Charlie", "2"))
        dataList.add(MyItem(R.drawable.ex3, "Daisy", "1.5"))
        dataList.add(MyItem(R.drawable.ex4, "Duke", "1"))
        dataList.add(MyItem(R.drawable.ex5, "Max", "2"))
        dataList.add(MyItem(R.drawable.ex6, "Happy", "4"))
        dataList.add(MyItem(R.drawable.ex7, "Luna", "3"))
        dataList.add(MyItem(R.drawable.ex8, "Bob", "2"))

        binding.custom.adapter = MyAdapter(this, dataList)
    }
}


