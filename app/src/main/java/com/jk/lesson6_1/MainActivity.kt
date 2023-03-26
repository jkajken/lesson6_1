package com.jk.lesson6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jk.lesson6_1.databinding.ActivityMainBinding
import com.jk.lesson6_1.utils.loadImage
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var images = arrayListOf(
        "https://i.pinimg.com/originals/71/78/7d/71787d065c6fc1b1503f159e34321f52.jpg",
        "https://i.pinimg.com/originals/da/3f/9b/da3f9b23d5ff5717e535895905554ac6.jpg",
        "https://i.pinimg.com/originals/9e/59/e3/9e59e38593a9355112644a0396d5f3ba.jpg",
        "https://i.pinimg.com/originals/31/f4/ed/31f4eddf47c4ca7c4691760ad938ddec.jpg",
        "https://i.pinimg.com/originals/93/4b/33/934b3331b361dea3c6a914ae44502e32.jpg",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnSubmit.setOnClickListener {
                images.add(editText.text.toString())
            }
            btnRandom.setOnClickListener {
                imgV.loadImage(images[Random.nextInt(images.size)])

            }
        }
    }
}