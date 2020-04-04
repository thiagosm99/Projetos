package com.example.appnac01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSobre(View view) {
        Intent intent = new Intent(this,RespostaActivity.class);
        startActivity(intent);
    }
    public void onAmericanas(View view) {
        Intent intent = new Intent(this,AmericanasActivity.class);
        startActivity(intent);
    }
    public void onEbay(View view) {
        Intent intent = new Intent(this,EbayActivity.class);
        startActivity(intent);
    }
    public void onNetshoes(View view) {
        Intent intent = new Intent(this,NetshoesActivity.class);
        startActivity(intent);
    }
    public void onMercado(View view) {
        Intent intent = new Intent(this,MercadoActivity.class);
        startActivity(intent);
    }
}
