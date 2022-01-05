package com.huxiaozhu.opencvdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.huxiaozhu.opencvdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = MyDemo.stringFromJNI()
    }

}