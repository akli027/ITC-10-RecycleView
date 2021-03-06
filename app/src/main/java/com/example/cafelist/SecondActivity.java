package com.example.cafelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, description, price;
    String data1, data2 ,data3;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.image);
        title = findViewById(R.id.judul);
        price = findViewById(R.id.price);
        description = findViewById(R.id.description);

        getData();
        setData();
    }
    private  void getData(){
        if (getIntent().hasExtra("myImage")&& getIntent().hasExtra("data1")&&getIntent().hasExtra("data2")&& getIntent().hasExtra("data3")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            myImage = getIntent().getIntExtra("myImage",1);
        }else{
            Toast.makeText(this,"No data...",Toast.LENGTH_SHORT).show();
        }
    }

    private  void setData(){
        title.setText(data1);
        description.setText(data2);
        price.setText(data3);
        mainImageView.setImageResource(myImage);
    }
}
