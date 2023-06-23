package com.fanny.testapps

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edtName:EditText
    private lateinit var tvName: TextView
    private lateinit var btnSend: Button
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.edt_name)
        tvName = findViewById(R.id.tv_result)
        btnSend = findViewById(R.id.btn_send)

        btnSend.setOnClickListener {
            val name = edtName.text.toString()
            if (name.isEmpty()) {
                edtName.error = "Data Masih Kosong"

            }else {
                tvName.text = "Hello! My name is "+name
            }
        }
    }
}