package com.example.examen_final.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.example.examen_final.Domains.PopularDomain;
import com.example.examen_final.R;

public class DetailActivity extends AppCompatActivity {
private TextView titleTxt,locationTxt,bedTxt,guideTxt,wifiTxt,descriptionTxt,scoreTxt;
private PopularDomain item;
private ImageView picImg,backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
        setVariable();
    }

    private void setVariable() {
        item= (PopularDomain) getIntent().getSerializableExtra("object");
        titleTxt.setText(item.getTitle());
        scoreTxt.setText(""+ item.getScore());
        locationTxt.setText(item.getLocation());
        bedTxt.setText(item.getBed() + "cama");
        descriptionTxt.setText(item.getDescription());


        if(item.isGuide()){
            guideTxt.setText("Guia");
        }else {
            guideTxt.setText("No-Guia");
        }
        if(item.isWifi()){
            wifiTxt.setText("Wifi");
        }else {
            wifiTxt.setText("No-Wifi");
        }
        int drawableResId=getResources().getIdentifier(item.getPic(),"drawable",getPackageName());
        Glide.with(this)
                .load(drawableResId)
                .into(picImg);
        backBtn.setOnClickListener(v -> finish());

    }

    private void initView() {
        titleTxt=findViewById(R.id.titleTxt);
        locationTxt=findViewById(R.id.locationTxt);
        bedTxt=findViewById(R.id.bedTxt);
        guideTxt=findViewById(R.id.guideTxt);
        wifiTxt=findViewById(R.id.wifiTxt);
        descriptionTxt=findViewById(R.id.descriptionTxt);
        scoreTxt=findViewById(R.id.scoreTxt);
        picImg=findViewById(R.id.piclmg);
        scoreTxt=findViewById(R.id.scoreTxt);
        backBtn=findViewById(R.id.backBtn);

    }

}