package com.aaditya.humaranagar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aaditya.humaranagar.databinding.ActivityComplaintsBinding

class ComplaintsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityComplaintsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityComplaintsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarHome.setTitleTextColor(resources.getColor(android.R.color.black));
        binding.toolbarHome.title = resources.getString(R.string.page_title)
    }
}