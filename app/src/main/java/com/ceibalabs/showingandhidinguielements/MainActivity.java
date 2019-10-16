package com.ceibalabs.showingandhidinguielements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = (TextView) findViewById(R.id.textView);
    }

    public void showElement(View view){
        this.textView.setVisibility(View.VISIBLE);
    }

    public void hideElement(View view){
        this.textView.setVisibility(View.INVISIBLE);
    }
}
