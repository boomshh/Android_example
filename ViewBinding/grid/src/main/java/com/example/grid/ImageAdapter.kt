package com.example.grid

import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter : BaseAdapter() {
    override fun getCount(): Int {
        return mThumbIds.size
    }

    override fun getItem(position: Int): Any {
        return mThumbIds[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView: ImageView
        if (convertView == null) {
            imageView = ImageView(parent!!.context)
            imageView.layoutParams = AbsListView.LayoutParams(200, 200)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(8, 8, 8, 8)
        } else {
            imageView = convertView as ImageView
        }
        imageView.setImageResource(mThumbIds.get(position))
        return imageView
    }

    private val mThumbIds = arrayOf<Int>(
        R.drawable.ex1, R.drawable.ex2,
        R.drawable.ex3, R.drawable.ex4,
        R.drawable.ex5, R.drawable.ex6,
        R.drawable.ex7, R.drawable.ex8,
        R.drawable.ex2, R.drawable.ex1,
        R.drawable.ex4, R.drawable.ex3,
        R.drawable.ex6, R.drawable.ex5,
        R.drawable.ex8, R.drawable.ex7,
        R.drawable.ex6, R.drawable.ex3,
        R.drawable.ex5, R.drawable.ex4,

        )
}