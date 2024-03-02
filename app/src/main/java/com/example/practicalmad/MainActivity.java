package com.example.practicalmad;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButton1_1;
    private RadioButton radioButton1_2;
    private RadioGroup radioGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_12_e1);

        radioButton1_1 = findViewById(R.id.radioButton1_1);
        radioButton1_2 = findViewById(R.id.radioButton1_2);
        radioGroup2 = findViewById(R.id.radioGroup2);
    }

    public void showSelection(View view) {
        String selectedOption1 = getSelectedOption(radioButton1_1, radioButton1_2);
        String selectedOption2 = getSelectedOptionFromGroup(radioGroup2);

        String message = "Selected Options: " + selectedOption1 + ", " + selectedOption2;
        showToast(message);
    }

    private String getSelectedOption(RadioButton radioButton1, RadioButton radioButton2) {
        if (radioButton1.isChecked()) {
            return radioButton1.getText().toString();
        } else if (radioButton2.isChecked()) {
            return radioButton2.getText().toString();
        } else {
            return "None";
        }
    }

    private String getSelectedOptionFromGroup(RadioGroup radioGroup) {
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

        if (selectedRadioButtonId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
            return selectedRadioButton.getText().toString();
        } else {
            return "None";
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
