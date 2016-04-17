package com.test.mobillaborproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FilmsActivity.class));
            }
        };

        View.OnClickListener onClickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MyListActivity.class));
            }
        };

        Button button = (Button) findViewById(R.id.my_button);
        button.setOnClickListener(onClickListener);

        Button button2 = (Button) findViewById(R.id.my_button2);
        button2.setOnClickListener(onClickListener2);
    }
}
