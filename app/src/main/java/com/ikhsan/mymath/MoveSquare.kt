package com.ikhsan.mymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveSquare : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtSide: EditText
    private lateinit var btnWideSquare: Button
    private lateinit var btnAroundSquare: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_square)

        edtSide = findViewById(R.id.edt_sideSquare)
        btnWideSquare = findViewById(R.id.btn_wideSquare)
        btnAroundSquare = findViewById(R.id.btn_aroundSquare)
        tvResult = findViewById(R.id.tv_resultSquare)

        btnWideSquare.setOnClickListener(this)
        btnAroundSquare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_wideSquare) {
            val inputSide = edtSide.text.toString().trim()

            var isEmptyFields = false

            if (inputSide.isEmpty()) {
                isEmptyFields = true
                edtSide.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields) {
                val wide = inputSide.toDouble() * inputSide.toDouble()
                tvResult.text = wide.toString()
            }
        }

        if (v?.id == R.id.btn_aroundSquare) {
            val inputSide = edtSide.text.toString().trim()

            var isEmptyFields = false

            if (inputSide.isEmpty()) {
                isEmptyFields = true
                edtSide.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val around = inputSide.toDouble() * 4
                tvResult.text = around.toString()
            }
        }
    }
}