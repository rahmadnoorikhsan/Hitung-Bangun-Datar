package com.ikhsan.mymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveTriangle : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtBase: EditText
    private lateinit var edtHeight: EditText
    private lateinit var edtSideTriangle: EditText
    private lateinit var btnWideTriangle: Button
    private lateinit var btnAroundTriangle: Button
    private lateinit var tvResultTriangle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_triangle)

        edtBase = findViewById(R.id.edt_baseTriangle)
        edtHeight = findViewById(R.id.edt_heightTriangle)
        edtSideTriangle = findViewById(R.id.edt_sideTriangle)
        btnWideTriangle = findViewById(R.id.btn_wideTriangle)
        btnAroundTriangle = findViewById(R.id.btn_aroundTriangle)
        tvResultTriangle = findViewById(R.id.tv_resultTriangle)

        btnWideTriangle.setOnClickListener(this)
        btnAroundTriangle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_wideTriangle) {
            val inputBase = edtBase.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()

            var isEmptyFields = false

            if (inputBase.isEmpty()) {
                isEmptyFields = true
                edtBase.error = "Field ini tidak boleh kosong"
            }

            if (inputHeight.isEmpty()) {
                isEmptyFields = true
                edtHeight.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val wideTriangle = 0.5 * inputBase.toDouble() * inputHeight.toDouble()
                tvResultTriangle.text = wideTriangle.toString()
            }
        }

        if (v?.id == R.id.btn_aroundTriangle) {
            val inputBase = edtBase.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()
            val inputSide = edtSideTriangle.text.toString().trim()

            var isEmptyField = false

            if (inputBase.isEmpty()) {
                isEmptyField = true
                edtBase.error = "Field ini tidak boleh kosong"
            }

            if (inputHeight.isEmpty()) {
                isEmptyField = true
                edtHeight.error = "Field ini tidak boleh kosong"
            }

            if (inputSide.isEmpty()){
                isEmptyField = true
                edtSideTriangle.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val aroundTriangle = inputSide.toDouble() + inputSide.toDouble() + inputSide.toDouble()
                tvResultTriangle.text = aroundTriangle.toString()
            }
        }
    }
}