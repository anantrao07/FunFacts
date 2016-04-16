package com.example.android.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFacts extends AppCompatActivity {

    TextView mfunfactText;
    Button mButton;
    View mfunfactlayout;
    FactBook  fb = new FactBook();
    ColorBook cb = new ColorBook();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mButton = (Button)findViewById(R.id.funfactbutton);
        mfunfactText = (TextView)findViewById(R.id.funfacttextView);
        mfunfactlayout = (View) findViewById(R.id.funfactlayout);



    }


    /**
     * Dispatch onStart() to all fragments.  Ensure any created loaders are
     * now started.
     */
    @Override
    protected void onStart() {
        super.onStart();

        mButton.setText(R.string.button_name);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mfunfactText.setText(fb.getFunFact());
                int color = cb.getColor();
                mfunfactlayout.setBackgroundColor(color);
                mButton.setBackgroundColor(color);
            }
        });
        }

    @Override
    protected void onStop() {
        super.onStop();
    }




}
