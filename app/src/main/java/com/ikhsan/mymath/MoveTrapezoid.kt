package com.ikhsan.mymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveTrapezoid : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtTopSide: EditText
    private lateinit var edtBottomSide: EditText
    private lateinit var edtRightSide: EditText
    private lateinit var edtLeftSide: EditText
    private lateinit var edtHeightTrapezoid: EditText
    private lateinit var btnWideTrapezoid: Button
    private lateinit var btnAroundTrapezoid: Button
    private lateinit var tvResultTrapezoid: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_trapezoid)

        edtTopSide = findViewById(R.id.edt_topSide)
        edtBottomSide = findViewById(R.id.edt_bottomSide)
        edtRightSide = findViewById(R.id.edt_rightSide)
        edtLeftSide = findViewById(R.id.edt_leftSide)
        edtHeightTrapezoid = findViewById(R.id.edt_heightTrapezoid)
        btnWideTrapezoid = findViewById(R.id.btn_wideTrapezoid)
        btnAroundTrapezoid = findViewById(R.id.btn_aroundTrapezoid)
        tvResultTrapezoid = findViewById(R.id.tv_resultTrapezoid)

        btnWideTrapezoid.setOnClickListener(this)
        btnAroundTrapezoid.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_wideTrapezoid) {
            val inputTopSide = edtTopSide.text.toString().trim()
            val inputBottomSide = edtBottomSide.text.toString().trim()
            val inputHeightTrapezoid = edtHeightTrapezoid.text.toString().trim()

            var isEmptyField = false

            if (inputTopSide.isEmpty()) {
                isEmptyField = true
                edtTopSide.error = "Field ini tidak boleh kosong"
            }

            if (inputBottomSide.isEmpty()) {
                isEmptyField = true
                edtBottomSide.error = "Field ini tidak boleh kosong"
            }

            if (inputHeightTrapezoid.isEmpty()) {
                isEmptyField = true
                edtHeightTrapezoid.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val resultTrapezoid = 0.5 * (inputTopSide.toDouble() + inputBottomSide.toDouble()) * inputHeightTrapezoid.toDouble()
                tvResultTrapezoid.text = resultTrapezoid.toString()
            }
        }

        if (v?.id == R.id.btn_aroundTrapezoid) {
            val inputTopSide = edtTopSide.text.toString().trim()
            val inputBottomSide = edtBottomSide.text.toString().trim()
            val inputRightSide = edtRightSide.text.toString().trim()
            val inputLeftSide = edtLeftSide.text.toString().trim()

            var isEmptyField = false

            if (inputTopSide.isEmpty()) {
                isEmptyField = true
                edtTopSide.error = "Field ini tidak boleh kosong"
            }

            if (inputBottomSide.isEmpty()) {
                isEmptyField = true
                edtBottomSide.error = "Field ini tidak boleh kosong"
            }

            if (inputRightSide.isEmpty()) {
                isEmptyField = true
                edtRightSide.error = "Field ini tidak boleh kosong"
            }

            if (inputLeftSide.isEmpty()) {
                isEmptyField = true
                edtLeftSide.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val resultTrapezoid = inputTopSide.toDouble() + inputBottomSide.toDouble() + inputRightSide.toDouble() + inputLeftSide.toDouble()
                tvResultTrapezoid.text = resultTrapezoid.toString()
            }
        }
    }
}