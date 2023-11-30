package com.example.actividad2;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ShareActionProvider;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button play1, play2, play3, play4, play5, play6, download1, download2, download3, download4, download4, download5, download6, share1, share2, share3, share4, share5, share6, blue1, blue2, blue3, blue4, blue5, blue6;
//reproducir sonido play
    MediaPlayer mp1, mp2, mp3,mp4,mp5,mp6;
//boton descarga
    String url1,url2,url3,url4,url5,url6;

    private MediaPlayer mediaPlayerLargo;
    private MediaPlayer mediaPlayerCorto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //botones de play
        play1 =(Button) findViewById(R.id.play1);
        play2=(Button) findViewById(R.id.play2);
        play3=(Button) findViewById(R.id.play3);
        play4=(Button) findViewById(R.id.play4);
        play5=(Button) findViewById(R.id.play5);
        play6=(Button) findViewById(R.id.play6);

        //botones de descarga
        download1=(Button) findViewById(R.id.download1);
        download2=(Button) findViewById(R.id.download2);
        download3=(Button) findViewById(R.id.download3);
        download4=(Button) findViewById(R.id.download4);
        download5=(Button) findViewById(R.id.download5);
        download6=(Button) findViewById(R.id.download6);

        //botones de compartir
        share1=(Button) findViewById(R.id.share1);
        share2=(Button) findViewById(R.id.share2);
        share3=(Button) findViewById(R.id.share3);
        share4=(Button) findViewById(R.id.share4);
        share5=(Button) findViewById(R.id.share5);
        share6=(Button) findViewById(R.id.share6);

        //botones de bluetooth
        blue1=(Button) findViewById(R.id.blue1);
        blue2=(Button) findViewById(R.id.blue2);
        blue3=(Button) findViewById(R.id.blue3);
        blue4=(Button) findViewById(R.id.blue4);
        blue5=(Button) findViewById(R.id.blue5);
        blue6=(Button) findViewById(R.id.blue6);

        //conexion audio
        mp1=MediaPlayer.create(this,R.raw.sonic);
        mp2=MediaPlayer.create(this,R.raw.nextel);
        mp3=MediaPlayer.create(this,R.raw.iphone);
        mp4=MediaPlayer.create(this,R.raw.coin);
        mp5=MediaPlayer.create(this,R.raw.tuberia);
        mp6=MediaPlayer.create(this,R.raw.vida);

        //url
        url1="http://www.sonidosmp3gratis.com/download.php?id=16592&sonido=sony%20ericsson%20tono";
        url2="http://www.sonidosmp3gratis.com/download.php?id=16965&sonido=nextel%205";
        url3="http://www.sonidosmp3gratis.com/download.php?id=16748&sonido=iphone%20original";
        url4="http://www.sonidosmp3gratis.com/download.php?id=15456&sonido=mario%20moneda";
        url5="http://www.sonidosmp3gratis.com/download.php?id=15284&sonido=mario%20bros%20tuberia";
        url6="http://www.sonidosmp3gratis.com/download.php?id=15283&sonido=mario%20bros%20vida";


        //reproducir audio 1
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp1.isPlaying()){
                    mp1.pause();
                    Toast.makeText(MainActivity.this,"pausa",Toast.LENGTH_SHORT).show();
                }else {
                    mp1.start();
                    Toast.makeText(MainActivity.this,"play",Toast.LENGTH_SHORT).show();
                }
            }
        });
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp2.isPlaying()){
                    mp2.pause();
                    Toast.makeText(MainActivity.this,"pausa",Toast.LENGTH_SHORT).show();
                }else {
                    mp2.start();
                    Toast.makeText(MainActivity.this,"play",Toast.LENGTH_SHORT).show();
                }
            }
        });
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp3.isPlaying()){
                    mp3.pause();
                    Toast.makeText(MainActivity.this,"pausa",Toast.LENGTH_SHORT).show();
                }else {
                    mp3.start();
                    Toast.makeText(MainActivity.this,"play",Toast.LENGTH_SHORT).show();
                }
            }
        });
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp4.isPlaying()){
                    mp4.pause();
                    Toast.makeText(MainActivity.this,"pausa",Toast.LENGTH_SHORT).show();
                }else {
                    mp4.start();
                    Toast.makeText(MainActivity.this,"play",Toast.LENGTH_SHORT).show();
                }
            }
        });
        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp5.isPlaying()){
                    mp5.pause();
                    Toast.makeText(MainActivity.this,"pausa",Toast.LENGTH_SHORT).show();
                }else {
                    mp5.start();
                    Toast.makeText(MainActivity.this,"play",Toast.LENGTH_SHORT).show();
                }
            }
        });
        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp6.isPlaying()){
                    mp6.pause();
                    Toast.makeText(MainActivity.this,"pausa",Toast.LENGTH_SHORT).show();
                }else {
                    mp6.start();
                    Toast.makeText(MainActivity.this,"play",Toast.LENGTH_SHORT).show();
                }
            }
        });
        //descargas
        download1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse(url1);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        download2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse(url2);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        download3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse(url3);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        download4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse(url4);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        download5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse(url5);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        download6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse(url6);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        //compartir
        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, shareActivity.class);
                startActivity(i);

            }
        });
        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, shareActivity.class);
                startActivity(i);

            }
        });
        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, shareActivity.class);
                startActivity(i);

            }
        });
        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, shareActivity.class);
                startActivity(i);

            }
        });
        share5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, shareActivity.class);
                startActivity(i);

            }
        });
        share6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, shareActivity.class);
                startActivity(i);

            }
        });

    }


}