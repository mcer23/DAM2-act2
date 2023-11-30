package com.example.actividad2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shareActivity extends AppCompatActivity {

    Button back,face,insta,twitter,whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        back=(Button) findViewById(R.id.back);
        face=(Button) findViewById(R.id.face);
        insta=(Button) findViewById(R.id.insta);
        twitter=(Button) findViewById(R.id.twitter);
        whatsapp=(Button) findViewById(R.id.whatsapp);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(shareActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT,"Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage(".com.facebook.katana");
                startActivity(Intent.createChooser(share,"compartir"));
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT,"Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage(".com.instagram.android");
                startActivity(Intent.createChooser(share,"compartir"));
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT,"Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage(".com.twitter.android");
                startActivity(Intent.createChooser(share,"compartir"));
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT,"Encuentra la mejor variedad de sonidos en http://www.sonidosmp3gratis.com/");
                share.setPackage(".com.whatsapp");
                startActivity(Intent.createChooser(share,"compartir"));
            }
        });
    }
}