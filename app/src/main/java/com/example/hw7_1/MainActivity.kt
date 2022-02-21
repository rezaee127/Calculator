package com.example.hw7_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw7_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textSize()
        val arrayOfButtons= arrayListOf(binding.button1,binding.button2,binding.button3
            ,binding.button4,binding.button5,binding.button6,binding.button7,binding.button8
            ,binding.button9,binding.button10,binding.button11,binding.button12,binding.button13
            ,binding.button14,binding.button15,binding.button16,binding.button17,binding.button18)

       


    }


    private fun textSize() {
        val arrayOfButtons= arrayListOf(binding.textView,binding.button2,binding.button3
            ,binding.button4,binding.button5,binding.button6,binding.button7,binding.button8
            ,binding.button9,binding.button10,binding.button11,binding.button12,binding.button13
            ,binding.button14,binding.button15,binding.button16,binding.button17,binding.button18)
        for (button in arrayOfButtons){
            button.textSize=38F
        }
    }
}