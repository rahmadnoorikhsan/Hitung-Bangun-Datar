package com.ikhsan.mymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveRhombus : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtVertical: EditText
    private lateinit var edtHorizontal: EditText
    private lateinit var edtSide: EditText
    private lateinit var btnWide: Button
    private lateinit var btnAround: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_rhombus)

        edtVertical = findViewById(R.id.edt_d1Rhombus)
        edtHorizontal = findViewById(R.id.edt_d2Rhombus)
        edtSide = findViewById(R.id.edt_sideRhombus)
        btnWide = findViewById(R.id.btn_wideRhombus)
        btnAround = findViewById(R.id.btn_aroundRhombus)
        tvResult = findViewById(R.id.tv_resultRhombus)

        btnWide.setOnClickListener(this)
        btnAround.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_wideRhombus) {
            val inputVertical = edtVertical.text.toString().trim()
            val inputHorizontal = edtHorizontal.text.toString().trim()
            val inputSide = edtSide.text.toString().trim()

            var isEmptyField = false

            if (inputVertical.isEmpty()) {
                isEmptyField = true
                edtVertical.error = "Field ini tidak boleh kosong"
            }

            if (inputHorizontal.isEmpty()) {
                isEmptyField = true
                edtHorizontal.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val wideRhombus = 0.5 * inputVertical.toDouble() * inputHorizontal.toDouble()
                tvResult.text = wideRhombus.toString()
            }
        }

        if (v?.id == R.id.btn_aroundRhombus) {
            val inputSide = edtSide.text.toString().trim()

            var isEmptyField = false

            if (inputSide.isEmpty()) {
                isEmptyField = true
                edtSide.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val aroundResult = 4 * inputSide.toDouble()
                tvResult.text = aroundResult.toString()
            }
        }
    }
}