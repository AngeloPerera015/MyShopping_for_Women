package com.myshopping.myshoppingforwomen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private long pressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnfw1 = findViewById(R.id.btnfw1);
        Button btnfw2 = findViewById(R.id.btnfw2);
        Button btnfw3 = findViewById(R.id.btnfw3);
        Button btnfw4 = findViewById(R.id.btnfw4);

        Button btnfa1 = findViewById(R.id.btnfa1);
        Button btnfa2 = findViewById(R.id.btnfa2);
        Button btnfa3 = findViewById(R.id.btnfa3);
        Button btnfa4 = findViewById(R.id.btnfa4);
        Button btnfa5 = findViewById(R.id.btnfa5);
        Button btnfa6 = findViewById(R.id.btnfa6);
        Button btnfa7 = findViewById(R.id.btnfa7);
        Button btnfa8 = findViewById(R.id.btnfa8);
        Button btnfa9 = findViewById(R.id.btnfa9);
        Button btnfa10 = findViewById(R.id.btnfa10);
        Button btnfa11 = findViewById(R.id.btnfa11);
        Button btnfa12 = findViewById(R.id.btnfa12);
        Button btnfa13 = findViewById(R.id.btnfa13);
        Button btnfa14 = findViewById(R.id.btnfa14);
        Button btnfa15 = findViewById(R.id.btnfa15);
        Button btnfa16 = findViewById(R.id.btnfa16);
        Button btnfa17 = findViewById(R.id.btnfa17);

        Button btnco1 = findViewById(R.id.btnco1);
        Button btnco2 = findViewById(R.id.btnco2);
        Button btnco3 = findViewById(R.id.btnco3);
        Button btnco4 = findViewById(R.id.btnco4);
        Button btnco5 = findViewById(R.id.btnco5);
        Button btnco6 = findViewById(R.id.btnco6);

        btnfw1.setOnClickListener(this);
        btnfw2.setOnClickListener(this);
        btnfw3.setOnClickListener(this);
        btnfw4.setOnClickListener(this);

        btnfa1.setOnClickListener(this);
        btnfa2.setOnClickListener(this);
        btnfa3.setOnClickListener(this);
        btnfa4.setOnClickListener(this);
        btnfa5.setOnClickListener(this);
        btnfa6.setOnClickListener(this);
        btnfa7.setOnClickListener(this);
        btnfa8.setOnClickListener(this);
        btnfa9.setOnClickListener(this);
        btnfa10.setOnClickListener(this);
        btnfa11.setOnClickListener(this);
        btnfa12.setOnClickListener(this);
        btnfa13.setOnClickListener(this);
        btnfa14.setOnClickListener(this);
        btnfa15.setOnClickListener(this);
        btnfa16.setOnClickListener(this);
        btnfa17.setOnClickListener(this);

        btnco1.setOnClickListener(this);
        btnco2.setOnClickListener(this);
        btnco3.setOnClickListener(this);
        btnco4.setOnClickListener(this);
        btnco5.setOnClickListener(this);
        btnco6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnfw1) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.nierashoes.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfw2) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.laydeez.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfw3) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://pawahan.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfw4) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://helankashoes.lk/");
            startActivity(intent);
        }

        if (view.getId() == R.id.btnfa1) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://mimosaforever.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa2) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://springandsummer.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa3) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://zigmajones.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa4) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.daisybloomdesigns.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa5) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://nilsonline.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa6) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.fashionbug.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa7) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://midnightdivas.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa8) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://zigzag.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa9) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.nolimit.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa10) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.tfo.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa11) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://coolplanet.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa12) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.sriyanidresspoint.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa13) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://odel.lk/home");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa14) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.thilakawardhana.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa15) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://foaclothing.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa16) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://kellyfelder.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnfa17) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://cibonline.lk/");
            startActivity(intent);
        }

        if (view.getId() == R.id.btnco1) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://viana.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnco2) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://lk.spaceylon.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnco3) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://www.luvesence.com/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnco4) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://britishcosmetics.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnco5) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://janet.lk/");
            startActivity(intent);
        }
        if (view.getId() == R.id.btnco6) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            intent.putExtra(WebViewActivity.WEBSITE_ADDRESS, "https://foreverskinnaturals.com/");
            startActivity(intent);
        }
    }
    @Override
    public void onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "press Back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}