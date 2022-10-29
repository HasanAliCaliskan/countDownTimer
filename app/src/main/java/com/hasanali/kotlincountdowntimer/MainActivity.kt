package com.hasanali.kotlincountdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.hasanali.kotlincountdowntimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val v = binding.root
        setContentView(v)



        var timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(p0: Long) {
                binding.textView.text = "Left: ${p0/1000}"
            }

            override fun onFinish() {
                binding.textView.text = "Done!"
            }
        }
        timer.start()







    }




}