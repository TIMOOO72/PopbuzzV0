package com.example.popbuzz.popbuzzv0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;


/**
 * Created by Timothy on 26/01/2017.
 */

public class LikeQuizzActivity extends AppCompatActivity {
    private Boolean like_car = Boolean.FALSE;
    private Boolean like_sport = Boolean.FALSE;
    private Boolean like_music = Boolean.FALSE;
    private Boolean like_movie = Boolean.FALSE;
    private Boolean like_science = Boolean.FALSE;
    private Boolean like_politic = Boolean.FALSE;
    private Boolean like_art = Boolean.FALSE;
    private Boolean like_economic = Boolean.FALSE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.like_quizz_activity);

        CheckBox check_car = (CheckBox) findViewById (R.id.checkBoxCar);

        CheckBox check_sport = (CheckBox) findViewById (R.id.checkBoxSport);

        CheckBox check_music = (CheckBox) findViewById (R.id.checkBoxMusic);

        CheckBox check_movie = (CheckBox) findViewById (R.id.checkBoxMovie);

        CheckBox check_science = (CheckBox) findViewById (R.id.checkBoxScience);

        CheckBox check_politic = (CheckBox) findViewById (R.id.checkBoxPolitic);

        CheckBox check_art = (CheckBox) findViewById (R.id.checkBoxArt);

        CheckBox check_economic = (CheckBox) findViewById (R.id.checkBoxEconomic);

        if(check_car.isChecked ()){
            like_car = Boolean.TRUE;
        }
        if(check_sport.isChecked ()){
            like_sport = Boolean.TRUE;
        }
        if(check_music.isChecked ()){
            like_music = Boolean.TRUE;
        }
        if(check_movie.isChecked ()){
            like_movie = Boolean.TRUE;
        }

        if(check_science.isChecked ()){
            like_science = Boolean.TRUE;
        }
        if(check_politic.isChecked ()){
            like_politic = Boolean.TRUE;
        }
        if(check_art.isChecked ()){
            like_art = Boolean.TRUE;
        }
        if(check_economic.isChecked ()){
            like_economic = Boolean.TRUE;
        }
    }
}
