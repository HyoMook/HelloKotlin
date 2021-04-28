package org.techtown.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BmiKotilinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.heightfield)
        val weightField = findViewById<EditText>(R.id.weightfield)
        val btnBmi = findViewById<Button>(R.id.btnBmi)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnBmi.setOnClickListener {
            val sHeight = heightField.getText().toString()
            val sWeight = weightField.getText().toString()

            if (!sHeight.equals("") && !sWeight.equals("")) {
                val bmi = sWeight.toDouble() / Math.pow(sHeight.toDouble() / 100.0, 2.0)
                txtResult.setText("Your BMI = " + bmi)
            } else {
                txtResult.setText("Input(s) missing")
            }
        }
    }
}