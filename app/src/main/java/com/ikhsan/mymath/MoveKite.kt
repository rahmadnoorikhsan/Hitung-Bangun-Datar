package com.ikhsan.mymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveKite : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtVertical: EditText
    private lateinit var edtHorizontal: EditText
    private lateinit var edtShortSide: EditText
    private lateinit var edtLongSide: EditText
    private lateinit var btnWideKite: Button
    private lateinit var btnAroundKite: Button
    private lateinit var tvResultKite: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_kite)

        edtVertical = findViewById(R.id.edt_d1)
        edtHorizontal = findViewById(R.id.edt_d2)
        edtShortSide = findViewById(R.id.edt_sideShort)
        edtLongSide = findViewById(R.id.edt_longSide)
        btnWideKite = findViewById(R.id.btn_wideKite)
        btnAroundKite = findViewById(R.id.btn_aroundKite)
        tvResultKite = findViewById(R.id.tv_resultKite)

        btnWideKite.setOnClickListener(this)
        btnAroundKite.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_wideKite) {
            val inputVertical = edtVertical.text.toString().trim()
            val inputHorizontal = edtHorizontal.text.toString().trim()

            var isEmptyField = false

            if (inputVertical.isEmpty()) {
                isEmptyField = true
                edtVertical.error = "Field ini tidak boleh kosong"
            }

            if (inputHorizontal.isEmpty()) {
                isEmptyField = true
                edtHorizontal.error = "Field ini tidak boleh kosong"
            }

            if(!isEmptyField) {
                val wideKite = 0.5 * inputVertical.toDouble() * inputHorizontal.toDouble()
                tvResultKite.text = wideKite.toString()
            }
        }

        if (v?.id == R.id.btn_aroundKite) {
            val inputShortSide = edtShortSide.text.toString().trim()
            val inputLongSide = edtLongSide.text.toString().trim()

            var isEmptyField = false

            if (inputShortSide.isEmpty()) {
                isEmptyField = true
                edtShortSide.error = "Field ini tidak boleh kosong"
            }

            if (inputLongSide.isEmpty()) {
                isEmptyField = true
                edtLongSide.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val aroundKite = 2 * (inputShortSide.toDouble() + inputLongSide.toDouble())
                tvResultKite.text = aroundKite.toString()
            }
        }
    }
}