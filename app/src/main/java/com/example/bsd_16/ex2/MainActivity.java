package com.example.bsd_16.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Contain the elements of the layout
    EditText et;
    TextView tw;
    private static final int MAX_NUM = 10; // Maximum number of envelopes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /* Invoked after the button is clicked */
    public void btnClicked(View v) {
        // Get the elements from the layout
        et = (EditText) findViewById(R.id.editText);
        tw = (TextView) findViewById(R.id.textView2);
        int et_val = Integer.valueOf(et.getText().toString()); // Get value of et
        String output = "";

        if (et_val > MAX_NUM) {
            output += "That's too much! This apps gives you 10 at most.";
        } else {
            for (int i = 0; i < et_val; i++) {
                // U+2079 is the unicode character for envelope
                output += "\u2709";
            }
        }

        // Pass the value of 'output' to the text view
        tw.setText(output);
    }
}
