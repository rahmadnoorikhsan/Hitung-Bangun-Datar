package com.ikhsan.mymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveRectangle : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtLength: EditText
    private lateinit var edtWidth: EditText
    private lateinit var btnWideRectangle: Button
    private lateinit var btnAroundRectangle: Button
    private lateinit var tvResultRectangle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_rectangle)

        edtLength = findViewById(R.id.edt_lengthRectangle)
        edtWidth = findViewById(R.id.edt_widthRectangle)
        btnWideRectangle = findViewById(R.id.btn_wideRectangle)
        btnAroundRectangle = findViewById(R.id.btn_aroundRectangle)
        tvResultRectangle = findViewById(R.id.tv_resultRectangle)

        btnWideRectangle.setOnClickListener(this)
        btnAroundRectangle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_wideRectangle) {
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()

            var isEmptyField = false

            if (inputLength.isEmpty()) {
                isEmptyField = true
                edtLength.error = "Field ini tidak boleh kosong"
            }

            if (inputWidth.isEmpty()) {
                isEmptyField = true
                edtWidth.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val wideRectangle = inputLength.toDouble() * inputWidth.toDouble()
                tvResultRectangle.text = wideRectangle.toString()
            }
        }

        if (v?.id == R.id.btn_aroundRectangle) {
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()

            var isEmptyField = false

            if (inputLength.isEmpty()) {
                isEmptyField = true
                edtLength.error = "Field ini tidak boleh kosong"
            }

            if (inputWidth.isEmpty()) {
                isEmptyField = true
                edtWidth.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val aroundRectangle = (2 * inputLength.toDouble()) + (2 * inputWidth.toDouble())
                tvResultRectangle.text = aroundRectangle.toString()
            }
        }
    }
}