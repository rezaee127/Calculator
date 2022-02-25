package com.example.hw7_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.hw7_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var a = 0F
    var b = 0F
    var x="0"
    var operator = ""
    var flag = false
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textSize()

        onClick()

        binding.delete.setOnClickListener {
            delete()
        }

    }

    private fun delete() {
        a = 0F
        b = 0F
        binding.textView.text = "0"
        x = "0"
        operatorsClickable()
        bEqual_bDot_Clickable()
}

    @SuppressLint("SetTextI18n")
    private fun onClick() {
        val arrayOfButtonNumbers= arrayListOf(binding.b1,binding.b0
            ,binding.b4,binding.b5,binding.b6,binding.b7,binding.b8
            ,binding.b9,binding.b2,binding.b3)

        for (button in arrayOfButtonNumbers){
            button.setOnClickListener {
                binding.textView.text = "" + binding.textView.text + button.text
                x += button.text
                Toast.makeText(this,"${button.text}",Toast.LENGTH_SHORT).show()

            }
        }


        binding.bDot.setOnClickListener {
            binding.textView.text = "" + binding.textView.text + binding.bDot.text
            x += binding.bDot.text
            Toast.makeText(this,"${binding.bDot.text}",Toast.LENGTH_SHORT).show()
            binding.bDot.isEnabled=false
        }

        binding.bAdd.setOnClickListener {
            bEqual_bDot_Clickable()
            Toast.makeText(this,"${binding.bAdd.text}",Toast.LENGTH_SHORT).show()
            if ( x!="") {
                flag = true
                a = (x.toString()).toFloat()
                x = ""
                binding.textView.text = "$a+"
                operator = "+"
            }
            operatorsUnClickable()
        }
        binding.bDiv.setOnClickListener {
            bEqual_bDot_Clickable()
            Toast.makeText(this,"${binding.bDiv.text}",Toast.LENGTH_SHORT).show()
            if (x!="") {
                flag = true
                a = (x.toString()).toFloat()
                x = ""
                binding.textView.text = "$a/"
                operator = "/"
            }
            operatorsUnClickable()
        }
        binding.bMul.setOnClickListener {
            bEqual_bDot_Clickable()
            Toast.makeText(this,"${binding.bMul.text}",Toast.LENGTH_SHORT).show()
            if (x!="") {
                flag = true
                a = (x.toString()).toFloat()
                x = ""
                binding.textView.text = "$a*"
                operator = "*"
            }
            operatorsUnClickable()
        }
        binding.bMinus.setOnClickListener {
            bEqual_bDot_Clickable()
            Toast.makeText(this,"${binding.bMinus.text}",Toast.LENGTH_SHORT).show()
            if ( x!="") {
                flag = true
                a = (x.toString()).toFloat()
                x = ""
                binding.textView.text = "$a-"
                operator = "-"
            }
            operatorsUnClickable()
        }

        binding.bEqual.setOnClickListener {
            operatorsClickable()
            binding.bDot.isEnabled=true
            binding.bEqual.isClickable=false
            Toast.makeText(this,"${binding.bEqual.text}",Toast.LENGTH_SHORT).show()
            if (flag && x!="") {
                b = x.toString().toFloat()
                if (operator == "+") {
                    x = (a + b).toString()
                    binding.textView.text =
                        "" + binding.textView.text + binding.bEqual.text + x
                }
                if (operator == "-") {
                    x = (a - b).toString()
                    binding.textView.text =
                        "" + binding.textView.text + binding.bEqual.text + x
                }
                if (operator == "*") {
                    x = (a * b).toString()
                    binding.textView.text =
                        "" + binding.textView.text + binding.bEqual.text + x
                }
                if (operator == "/") {
                    if (b != 0F) {
                        x = (a / b).toString()
                        binding.textView.text =
                            "" + binding.textView.text + binding.bEqual.text + x
                    } else {
                        Toast.makeText(this,"Divide by zero",Toast.LENGTH_SHORT).show()
                        delete()
                    }
                }

            }
            flag=false
        }
    }


    private  fun operatorsUnClickable(){
        binding.bAdd.isClickable=false
        binding.bDiv.isClickable=false
        binding.bMinus.isClickable=false
        binding.bMul.isClickable=false
    }

    private  fun operatorsClickable(){
        binding.bAdd.isClickable=true
        binding.bDiv.isClickable=true
        binding.bMinus.isClickable=true
        binding.bMul.isClickable=true
    }

    private fun bEqual_bDot_Clickable(){
        binding.bEqual.isClickable=true
        binding.bDot.isEnabled=true
    }

    private fun textSize() {
        val arrayOfButtons= arrayListOf(binding.b1,binding.b0
            ,binding.b4,binding.b5,binding.b6,binding.b7,binding.b8
            ,binding.b9,binding.b2,binding.b3,binding.bDot ,binding.bMul
            ,binding.bAdd,binding.bMinus,binding.bDiv,binding.bEqual)
        for (button in arrayOfButtons){
            button.textSize=30F
        }
        binding.textView.textSize=28F
        binding.delete.textSize=13F
    }
}