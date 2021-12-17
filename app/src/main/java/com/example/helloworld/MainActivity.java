package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = ((TextView) findViewById(R.id.text));
        // Pre-work requirement #3: User can tap a button to change the text color of the label.
        findViewById(R.id.changeTextColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change text color of label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.darkRed));
            }
        });

        // Pre-work Optional User Story #1: User can tap a button to change the color of the background view.
        findViewById(R.id.changeBackgroundColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightOrange));
            }
        });

        // Pre-work Optional User Story #2: User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is awesome!");
            }
        });


        // Pre-work Option User Story #3: User can tap on the background view to reset all views to default settings.
        // 1. Reset the text to "Hello from Crislana!" id - @id/text
        // 2. Reset the color of the text to the original color
            // original text color is black - text id - @id/text
        // 3. Reset the background color
            // original background color is R.color.lightBlue
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. Reset the text to "Hello from Crislana!" id - @id/text
                textView.setText("Hello from Crislana!");
                // 2. Reset the color of the text to the original color
                // original text color is black - text id - @id/text
                textView.setTextColor(getResources().getColor(R.color.black));
                // 3. Reset the background color
                // original background color is R.color.lightBlue
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightBlue));

            }
        });

        // Pre-work Option User Story #4: User can update the label text with custom text entered into the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text view to what's in the edit text view
                String userText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //If text field is empty, update label with default text string
                if (userText.isEmpty()){
                    textView.setText("Enter your own text!");
                }
                else {
                    textView.setText(userText);
                }

            }
        });
    }
}