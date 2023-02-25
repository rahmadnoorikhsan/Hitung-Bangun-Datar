package com.ikhsan.mymath

import android.content.Intent
import android.hardware.camera2.params.MeteringRectangle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSquare: Button
    private lateinit var btnRectangle: Button
    private lateinit var btnTriangle: Button
    private lateinit var btnTrapezoid: Button
    private lateinit var btnParallelogram: Button
    private lateinit var btnKite: Button
    private lateinit var btnRhombus: Button
    private lateinit var btnCircle: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSquare = findViewById(R.id.btn_square)
        btnRectangle = findViewById(R.id.btn_rectangle)
        btnTriangle = findViewById(R.id.btn_triangle)
        btnTrapezoid = findViewById(R.id.btn_trapezoid)
        btnParallelogram = findViewById(R.id.btn_parallelogram)
        btnKite = findViewById(R.id.btn_kite)
        btnRhombus = findViewById(R.id.btn_rhombus)
        btnCircle = findViewById(R.id.btn_circle)

        btnSquare.setOnClickListener(this)
        btnRectangle.setOnClickListener(this)
        btnTriangle.setOnClickListener(this)
        btnTrapezoid.setOnClickListener(this)
        btnParallelogram.setOnClickListener(this)
        btnKite.setOnClickListener(this)
        btnRhombus.setOnClickListener(this)
        btnCircle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_square -> {
                val moveSquare = Intent(this@MainActivity, MoveSquare::class.java)
                startActivity(moveSquare)
            }
            R.id.btn_rectangle -> {
                val moveRectangle = Intent(this@MainActivity, MoveRectangle::class.java)
                startActivity(moveRectangle)
            }
            R.id.btn_triangle -> {
                val moveTriangle = Intent(this@MainActivity, MoveTriangle::class.java)
                startActivity(moveTriangle)
            }
            R.id.btn_trapezoid -> {
                val moveTrapezoid = Intent(this@MainActivity, MoveTrapezoid::class.java)
                startActivity(moveTrapezoid)
            }
            R.id.btn_parallelogram -> {
                val moveParallelogram = Intent(this@MainActivity, MoveParallelogram::class.java)
                startActivity(moveParallelogram)
            }
            R.id.btn_kite -> {
                val moveKite = Intent(this@MainActivity, MoveKite::class.java)
                startActivity(moveKite)
            }
            R.id.btn_rhombus -> {
                val moveRhombus = Intent(this@MainActivity, MoveRhombus::class.java)
                startActivity(moveRhombus)
            }
            R.id.btn_circle -> {
                val moveCircle = Intent(this@MainActivity, MoveCircle::class.java)
                startActivity(moveCircle)
            }
        }
    }
}