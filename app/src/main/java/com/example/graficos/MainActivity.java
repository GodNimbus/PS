package com.example.graficos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Drawable miImagen;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
/*
    public class ExempleView extends View {
        public ExempleView(Context context) {
            super(context);
            miImagen = ContextCompat.getDrawable(MainActivity.this,R.drawable.nimbus);
            miImagen.setBounds(30,30,400,400);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            miImagen.draw(canvas);
        }
    }*/
}
