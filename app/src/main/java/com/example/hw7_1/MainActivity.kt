package com.example.hw7_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw7_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var a = 0F
    var b = 0F
    var operator = ""
    var flag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textSize()

        onClick()

        delete()


    }

    private fun delete() {
    binding.delete.setOnClickListener{
        a = 0F
        b = 0F
        binding.textView.text = "0"
        binding.text.text = "0"
    }
}

    @SuppressLint("SetTextI18n")
    private fun onClick() {
        binding.b0.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b0.text
            binding.text.text = "" + binding.text.text + binding.b0.text
        }
        binding.b1.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b1.text
            binding.text.text = "" + binding.text.text + binding.b1.text
        }
        binding.b2.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b2.text
            binding.text.text = "" + binding.text.text + binding.b2.text
        }
        binding.b3.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b3.text
            binding.text.text = "" + binding.text.text + binding.b3.text
        }
        binding.b4.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b4.text
            binding.text.text = "" + binding.text.text + binding.b4.text
        }
        binding.b5.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b5.text
            binding.text.text = "" + binding.text.text + binding.b5.text
        }
        binding.b6.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b6.text
            binding.text.text = "" + binding.text.text + binding.b6.text
        }
        binding.b7.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b7.text
            binding.text.text = "" + binding.text.text + binding.b7.text
        }
        binding.b8.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b8.text
            binding.text.text = "" + binding.text.text + binding.b8.text
        }
        binding.b9.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.b9.text
            binding.text.text = "" + binding.text.text + binding.b9.text
        }
        binding.bn.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.bn.text
            binding.text.text = "" + binding.text.text + binding.bn.text
        }

        binding.ba.setOnClickListener {
            if ( binding.text.text!="") {
                flag = true
                a = (binding.text.text.toString()).toFloat()
                binding.text.text = ""
                binding.textView.text = "$a+"
                operator = "+"
            }
        }
        binding.bd.setOnClickListener {
            if ( binding.text.text!="") {
                flag = true
                a = (binding.text.text.toString()).toFloat()
                binding.text.text = ""
                binding.textView.text = "$a/"
                operator = "/"
            }
        }
        binding.bmul.setOnClickListener {
            if ( binding.text.text!="") {
                flag = true
                a = (binding.text.text.toString()).toFloat()
                binding.text.text = ""
                binding.textView.text = "$a*"
                operator = "*"
            }
        }
        binding.bmin.setOnClickListener {
            if ( binding.text.text!="") {
                flag = true
                a = (binding.text.text.toString()).toFloat()
                binding.text.text = ""
                binding.textView.text = "$a-"
                operator = "-"
            }
        }

        binding.be.setOnClickListener {
            if (flag && binding.text.text!="") {
                b = binding.text.text.toString().toFloat()
                if (operator == "+") {
                    binding.text.text = (a + b).toString()
                    binding.textView.text =
                        "" + binding.textView.text + binding.be.text + binding.text.text
                }
                if (operator == "-") {
                    binding.text.text = (a - b).toString()
                    binding.textView.text =
                        "" + binding.textView.text + binding.be.text + binding.text.text
                }
                if (operator == "*") {
                    binding.text.text = (a * b).toString()
                    binding.textView.text =
                        "" + binding.textView.text + binding.be.text + binding.text.text
                }
                if (operator == "/") {
                    if (b != 0F) {
                        binding.text.text = (a / b).toString()
                        binding.textView.text =
                            "" + binding.textView.text + binding.be.text + binding.text.text
                    } else {
                        binding.text.text = "divide to 0"
                        binding.textView.text = "divide to 0"
                    }

                }

            }
            flag=false
        }
    }


    private fun textSize() {
        val arrayOfButtons= arrayListOf(binding.b1,binding.b0
            ,binding.b4,binding.b5,binding.b6,binding.b7,binding.b8
            ,binding.b9,binding.b2,binding.b3,binding.bn ,binding.bmul
            ,binding.ba,binding.bmin,binding.bd,binding.be)
        for (button in arrayOfButtons){
            button.textSize=30F
        }
        binding.textView.textSize=28F
        binding.delete.textSize=13F
    }
}