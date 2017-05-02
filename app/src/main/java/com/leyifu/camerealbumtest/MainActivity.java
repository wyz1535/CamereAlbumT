package com.leyifu.camerealbumtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_get_camere;
    private Button bt_photo_album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_get_camere = ((Button) findViewById(R.id.bt_get_camere));
        bt_photo_album = ((Button) findViewById(R.id.bt_photo_album));
        bt_get_camere.setOnClickListener(this);
        bt_photo_album.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_get_camere:
                startActivity(new Intent(MainActivity.this,TakePhotoActivity.class));
                break;
            case R.id.bt_photo_album:
                startActivity(new Intent(MainActivity.this,PhotoAlbumActivity.class));
                break;
        }
    }

}
