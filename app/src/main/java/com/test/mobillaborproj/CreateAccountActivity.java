package com.test.mobillaborproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        String email;
        String name;
        String password;

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profile newProfile = new Profile("RandomName", "email@email.com", "asdf", new ArrayList<Film>());
                newProfile.save();
            }
        };

        EditText editText = (EditText) findViewById(R.id.email_address);
        EditText editText2 = (EditText) findViewById(R.id.name);
        EditText editText3 = (EditText) findViewById(R.id.password);
        /*editText.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    sendMessage();
                    handled = true;
                }
                return handled;
            }
        });*/
        Button button = (Button) findViewById(R.id.my_button);
        button.setOnClickListener(onClickListener);
    }
}
