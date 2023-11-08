package com.example.stepic_course

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.btn_one)
        val btn2: Button = findViewById(R.id.btn_two)
        val btn3: Button = findViewById(R.id.btn_three)
        val btn4: Button = findViewById(R.id.btn_four)
        val btn5: Button = findViewById(R.id.btn_five)
        val btn6: Button = findViewById(R.id.btn_six)
        val btn7: Button = findViewById(R.id.btn_seven)
        val btn8: Button = findViewById(R.id.btn_eight)
        val btn9: Button = findViewById(R.id.btn_nine)
        val btn0: Button = findViewById(R.id.btn_zero)
        val btn_sign: Button = findViewById(R.id.btn_sign)
        val btn_ok: Button = findViewById(R.id.btn_ok)

        val editText: EditText = findViewById(R.id.editText)

        btn1.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "1")
        }
        btn2.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "2")
        }
        btn3.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "3")
        }
        btn4.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "4")
        }
        btn5.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "5")
        }
        btn6.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "6")
        }
        btn7.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "7")
        }
        btn8.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "8")
        }
        btn9.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "9")
        }
        btn0.setOnClickListener { button ->
            editText.setText(editText.getText().toString() + "0")
        }
        btn_sign.setOnClickListener { button ->
            val textString = editText.getText().toString()
            if (textString.length >0){
                editText.setText(textString.substring(0,textString.length-1))
                editText.setSelection(editText.text.length)
                editText.setTextColor(getColor(R.color.btn_textColor))
            }
        }
        btn_ok.setOnClickListener { button ->
            if (editText.getText().toString() == "1567") {
                Toast.makeText(this, "Верный код", Toast.LENGTH_LONG).show()
                editText.setTextColor(getColor(R.color.btn_textColor))

            } else {
                Toast.makeText(this, "Неверно. Попробуйте ещё раз", Toast.LENGTH_LONG).show()
                editText.setTextColor(getColor(R.color.error_color))
            }
        }

    }
}