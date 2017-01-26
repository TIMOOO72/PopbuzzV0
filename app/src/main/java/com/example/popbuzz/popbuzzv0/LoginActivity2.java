package com.example.popbuzz.popbuzzv0;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;

import java.util.Arrays;

/**
 * Created by Timothy on 24/01/2017.
 */

public class LoginActivity2 extends AppCompatActivity {
    CallbackManager callbackManager;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        FacebookSdk.sdkInitialize (getApplicationContext ());
        setContentView (R.layout.activity_login2);
        callbackManager = CallbackManager.Factory.create();

        Intent intent = getIntent();
        Boolean fb_login = intent.getBooleanExtra("fb_login", Boolean.TRUE);

        if(fb_login){
            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
        }

        findViewById (R.id.button_back).setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        findViewById (R.id.buttonNext).setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), PopActivity.class);
                startActivity(intent);
            }
        });


    }
    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
