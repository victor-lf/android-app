package com.victor.massconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.inputValue);
    }

    // this method is called at button click because we assigned the name to the
    // "OnClick" property of the button
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                RadioButton kgButton = findViewById(R.id.radio0);
                RadioButton lbButton = findViewById(R.id.radio1);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (kgButton.isChecked()) {
                    text.setText(String
                            .valueOf(ConverterUtil.convertPoundToKilogram(inputValue)));
                    //kgButton.setChecked(false);
                    //lbButton.setChecked(true);
                } else {
                    text.setText(String
                            .valueOf(ConverterUtil.convertKilogramToPound(inputValue)));
                    //lbButton.setChecked(false);
                    //kgButton.setChecked(true);
                }
                break;
        }
    }

}
