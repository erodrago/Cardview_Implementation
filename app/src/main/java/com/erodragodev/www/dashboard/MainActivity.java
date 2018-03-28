package com.erodragodev.www.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView bankCrd,ideasCard,addCard,linksCard,wifiCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining cards
        bankCrd=findViewById(R.id.bank_card);
        ideasCard=findViewById(R.id.ideas_card);
        addCard=findViewById(R.id.add_card);
        linksCard=findViewById(R.id.links_card);
        wifiCard=findViewById(R.id.wifi_card);

        //add click listener to the cards
        bankCrd.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);


        //the onclick event is called everytime we click a cardview
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.bank_card:
//                i=new Intent(this,Bank.class);
//                startActivity(i);
                break;
            case R.id.add_card:
                i=new Intent(this,Add.class);
                startActivity(i);
                break;
            case R.id.wifi_card:
                i=new Intent(this,Wifi.class);
                startActivity(i);
                break;
            case R.id.ideas_card:
                i=new Intent(this,Ideas.class);
                startActivity(i);
                break;
            case R.id.links_card:
                i=new Intent(this,Links.class);
                startActivity(i);
                break;
                default:break;
        }
    }
}
