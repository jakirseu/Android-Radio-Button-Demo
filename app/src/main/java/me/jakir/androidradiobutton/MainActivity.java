package me.jakir.androidradiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        result = (Button) findViewById(R.id.button);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedButton = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedButton);
                Toast.makeText(MainActivity.this, "You have selected: " +
                        radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}
