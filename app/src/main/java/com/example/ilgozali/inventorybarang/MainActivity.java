package com.example.ilgozali.inventorybarang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bTambah;
    private Button bLihat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bTambah = (Button) findViewById(R.id.button_tambah);
        bTambah.setOnClickListener(this);
        bLihat = (Button)findViewById(R.id.button_view);
        bLihat.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId())
        {
            case R.id.button_tambah :
                Intent i = new Intent(this, CreateData.class);
                startActivity(i);
                break;
            case R.id.button_view :
                Intent bv = new Intent(this, ViewData.class);
                startActivity(bv);
                break;

        }
    }
}
