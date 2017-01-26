package com.example.popbuzz.popbuzzv0;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.facebook.FacebookSdk;


public class LoginActivity extends AppCompatActivity {
    Boolean fb_login = Boolean.FALSE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize (getApplicationContext ());
        setContentView(R.layout.activity_login);







        findViewById (R.id.login_fb_button).setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                fb_login = !fb_login;
                ImageButton btn = (ImageButton)findViewById(R.id.login_fb_button);
                if(fb_login){
                    btn.setImageResource(R.drawable.button_fb_pressed);
                }else{
                    btn.setImageResource(R.drawable.button_fb_normal);
                }
            }
        });

        findViewById (R.id.button_next).setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(fb_login){
                    Intent intent = new Intent (getApplicationContext(), LoginActivity2.class);
                    intent.putExtra("fb_login", fb_login);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent (getApplicationContext(), LikeQuizzActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
