package org.techtown.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText heightfield, weightfield;
    TextView txtResult;
    Button btnBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        heightfield = findViewById(R.id.heightfield);
        weightfield = findViewById(R.id.weightfield);
        txtResult = findViewById(R.id.txtResult);
        btnBmi = findViewById(R.id.btnBmi);

        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sHeight = heightfield.getText().toString();
                String sWeight = weightfield.getText().toString();
   /*             try {
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight) / 100.0, 2.0);
                    txtResult.setText("Your BMI = " + bmi);

                } catch (Exception e) {
                    txtResult.setText("Input(s) missing");
                } */
                if(!sHeight.equals("") && !sWeight.equals("")){
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight) / 100.0, 2.0);
                    txtResult.setText("Your BMI = " + bmi);
                } else {
                    txtResult.setText("Input(s) missing");
                }
            }
        });
    }
}