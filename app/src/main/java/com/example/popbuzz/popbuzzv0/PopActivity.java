package com.example.popbuzz.popbuzzv0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import org.json.JSONObject;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;

/**
 * Created by Timothy on 25/01/2017.
 */

public class PopActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        FacebookSdk.sdkInitialize (getApplicationContext ());
        setContentView (R.layout.ativity_pop);
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        Profile fb_profil = Profile.getCurrentProfile ();


    }

}
