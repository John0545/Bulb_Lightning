package com.example.ravi.transition;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button on,off;
    ImageView imageView;
    Drawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on = findViewById(R.id.btn_on);
        on.setClickable(false);
        off = findViewById(R.id.btn_off);
        imageView = findViewById(R.id.imageView);
        
        drawable = imageView.getDrawable();
    }

    public void Onclick(View view){

        switch(view.getId()){

            case R.id.btn_off:
                if(drawable instanceof TransitionDrawable)
                    ((TransitionDrawable) drawable).startTransition(1500);
                    off.setClickable(false);
                    on.setClickable(true);
                break;
            case R.id.btn_on:

                if(drawable instanceof TransitionDrawable)
                    ((TransitionDrawable) drawable).reverseTransition(1500);
                off.setClickable(true);
                on.setClickable(false);
                break;
        }
    }
}
