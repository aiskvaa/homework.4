package com.example.lesson4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lesson4.R;
import com.example.lesson4.model.BookModel;

public class SecondActivity extends AppCompatActivity {

     BookModel bookModel;
     TextView detailView, tvTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        detailView = findViewById(R.id.tv_detail);
        tvTitle = findViewById(R.id.tv_title);
        getData();

    }
    private void getData() {
        Intent intent = getIntent();
       bookModel = (BookModel) intent.getSerializableExtra("key");
        detailView.setText(bookModel.getDescription());
        tvTitle.setText(bookModel.getTitle());
    }
}