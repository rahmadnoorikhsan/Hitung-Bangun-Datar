package com.ikhsan.mymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.InputMismatchException

class MoveParallelogram : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtBaseParallelogram: EditText
    private lateinit var edtHeightParallelogram: EditText
    private lateinit var edtSideParallelogram: EditText
    private lateinit var btnWideParallelogram: Button
    private lateinit var btnAroundParallelogram: Button
    private lateinit var tvResultParallelogram: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_parallelogram)

        edtBaseParallelogram = findViewById(R.id.edt_baseParallelogram)
        edtHeightParallelogram = findViewById(R.id.edt_heightParallelogram)
        edtSideParallelogram = findViewById(R.id.edt_sideParallelogram)
        btnWideParallelogram = findViewById(R.id.btn_wideParallelogram)
        btnAroundParallelogram = findViewById(R.id.btn_aroundParallelogram)
        tvResultParallelogram = findViewById(R.id.tv_resultParallelogram)

        btnWideParallelogram.setOnClickListener(this)
        btnAroundParallelogram.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_wideParallelogram) {
            val inputBaseParallelogram = edtBaseParallelogram.text.toString().trim()
            val inputHeightParallelogram = edtHeightParallelogram.text.toString().trim()
            val inputSideParallelogram = edtSideParallelogram.text.toString().trim()

            var isEmptyField = false

            if (inputBaseParallelogram.isEmpty()) {
                isEmptyField = true
                edtBaseParallelogram.error = "Field ini tidak boleh kosong"
            }

            if (inputHeightParallelogram.isEmpty()) {
                isEmptyField = true
                edtHeightParallelogram.error = "Field ini tidak boleh kosong"
            }

            if (inputSideParallelogram.isEmpty()) {
                isEmptyField = true
                edtSideParallelogram.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val sideParallelogram = inputBaseParallelogram.toDouble() * inputHeightParallelogram.toDouble()
                tvResultParallelogram.text = sideParallelogram.toString()
            }
        }

        if (v?.id == R.id.btn_aroundParallelogram) {
            val inputBaseParallelogram = edtBaseParallelogram.text.toString().trim()
            val inputSideParallelogram = edtSideParallelogram.text.toString().trim()

            var isEmptyField = false

            if (inputBaseParallelogram.isEmpty()) {
                isEmptyField = true
                edtBaseParallelogram.error = "Field ini tidak boleh kosong"
            }

            if (inputSideParallelogram.isEmpty()) {
                isEmptyField = true
                edtSideParallelogram.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyField) {
                val aroundParallelogram = 2 * (inputBaseParallelogram.toDouble() + inputSideParallelogram.toDouble())
                tvResultParallelogram.text = aroundParallelogram.toString()
            }
        }
    }
}