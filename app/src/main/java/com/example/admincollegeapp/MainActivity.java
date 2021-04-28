package com.example.admincollegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.admincollegeapp.faculty.UploadFaculty;
import com.example.admincollegeapp.notice.DeleteNotice;
import com.example.admincollegeapp.notice.UploadNotice;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice , uploadImage , addEbook , faculty , deleteNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNotice);
        uploadImage = findViewById(R.id.addGallaryImage);
        addEbook = findViewById(R.id.addEbook);
        faculty = findViewById(R.id.faculty);
        deleteNotice = findViewById(R.id.deleteNotice);
        uploadNotice.setOnClickListener(this);
        uploadImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
        deleteNotice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addNotice:
                Intent intentUploadNotice = new Intent(this , UploadNotice.class);
                startActivity(intentUploadNotice);
                break;

            case R.id.addGallaryImage:
                Intent intentUploadImage = new Intent(this , UploadImage.class);
                startActivity(intentUploadImage);
                break;

            case R.id.addEbook:
                Intent intentUploadPDF = new Intent(this , UploadPDF.class);
                startActivity(intentUploadPDF);
                break;

            case R.id.faculty:
                Intent intentUploadFaculty = new Intent(this , UploadFaculty.class);
                startActivity(intentUploadFaculty);
                break;

            case R.id.deleteNotice:
                Intent intentDeleteNotice = new Intent(this , DeleteNotice.class);
                startActivity(intentDeleteNotice);
                break;
        }
    }
}