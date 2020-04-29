package com.example.chelseaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

public class Detail extends AppCompatActivity {
    private ImageView playerPhoto ;
    private ImageView imgDetailCountry;
    private TextView txtDetailName, txtDetailPosition, txtDetailHeight, txtDetailAge, txtDetailWeight,
            txtDetailMatch, txtDetailGoal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

         initVievs();



        final String nm = getIntent().getStringExtra("name");
        txtDetailName.setText(nm);

        final  String pos = getIntent().getStringExtra("position");
        txtDetailPosition.setText(pos);

        final  String phot = getIntent().getStringExtra("photo");

        Picasso.get()
                .load(phot)
                .fit()
                .centerCrop()
                .placeholder(R.drawable.country)
                .error(R.drawable.country)
                .into(playerPhoto);

        final  String countr = getIntent().getStringExtra("country");
        Picasso.get()
                .load(countr)
                .fit()
                .centerCrop()
                .placeholder(R.drawable.country)
                .error(R.drawable.country)
                .into(imgDetailCountry);

        final  int mat = getIntent().getIntExtra("match", 0);
        txtDetailMatch.setText(String.valueOf(mat));

        final  int gol = getIntent().getIntExtra("goal",0);
        txtDetailGoal.setText(String.valueOf(gol));

        final  int berat = getIntent().getIntExtra("weight",0);
        txtDetailWeight.setText(String.valueOf(berat));

        final  int umur = getIntent().getIntExtra("age",0);
        txtDetailAge.setText(String.valueOf(umur));

        final  int tinggi = getIntent().getIntExtra("height",0);
        txtDetailHeight.setText(String.valueOf(tinggi));





    }





    private void initVievs() {
        imgDetailCountry = findViewById(R.id.imgDetailCountry);
        txtDetailName = findViewById(R.id.txtDetailPlayer);
        txtDetailPosition = findViewById(R.id.txtDetailPosition);
        txtDetailHeight = findViewById(R.id.txtDetailHeight);
        txtDetailAge = findViewById(R.id.txtDetailAge);
        txtDetailWeight= findViewById(R.id.txtDetailWeight);
        txtDetailGoal = findViewById(R.id.txtDetailGoal);
        txtDetailMatch = findViewById(R.id.txtDetailMatch);
        playerPhoto = findViewById(R.id.detailPhoto);
    }
}
