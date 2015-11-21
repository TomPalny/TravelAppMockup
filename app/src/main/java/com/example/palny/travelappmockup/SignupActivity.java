package com.example.palny.travelappmockup;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.LinearLayout;

public class SignupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Drawable background = ContextCompat.getDrawable(this, R.drawable.paths);
        LinearLayout layout = (LinearLayout) findViewById(R.id.signupLayout);
        background.setAlpha(100);
        layout.setBackground(background);
    }

    public void signUpClicked(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
