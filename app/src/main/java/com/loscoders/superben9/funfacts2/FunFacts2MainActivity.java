package com.loscoders.superben9.funfacts2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFacts2MainActivity extends AppCompatActivity {
    //declare the view variables
    private TextView mfactTextView;
    private Button mShowFactButton;
  //a new comment to make a commit
    //another comment to make a commit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts2_main);

        // assing the views from the layout file to the corresponding variables
        //android automatically builds a resource file

        mfactTextView = (TextView) findViewById(R.id.FactTextView);
        mShowFactButton = (Button)findViewById(R.id.ShowFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // the button was clicked so update the t
                String fact = "Ostriches can run faster than horses";
                mfactTextView.setText(fact);



            }
        };


        mShowFactButton.setOnClickListener(listener);




    }
}
