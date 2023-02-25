package com.ikhsan.mymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveCircle : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtR: EditText
    private lateinit var btnWide: Button
    private lateinit var btnAround: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_circle)

        edtR = findViewById(R.id.edt_r)
        btnWide = findViewById(R.id.btn_wideCircle)
        btnAround = findViewById(R.id.btn_aroundCircle)
        tvResult = findViewById(R.id.tv_resultCircle)

        btnWide.setOnClickListener(this)
        btnAround.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_wideCircle) {
            val inputR = edtR.text.toString().trim()

            var isEmptyField = false

            if (inputR.isEmpty()) {
                isEmptyField = true
                edtR.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val wideCircle = 3.14 * inputR.toDouble() * inputR.toDouble()
                tvResult.text = wideCircle.toString()
            }
        }

        if (v?.id == R.id.btn_aroundCircle) {
            val inputR = edtR.text.toString().trim()

            var isEmptyField = false

            if (inputR.isEmpty()) {
                isEmptyField = true
                edtR.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val aroundCircle = 2 * 3.14 * inputR.toDouble()
                tvResult.text = aroundCircle.toString()
            }
        }
    }
}