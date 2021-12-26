package com.example.lesson4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson4.R;
import com.example.lesson4.adapter.AdapterBook;
import com.example.lesson4.data.BookClient;
import com.example.lesson4.interaces.OnClick;
import com.example.lesson4.model.BookModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterBook adapterBook;
    ArrayList<BookModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        clickListeners();
    }

    private void initialization() {
        recyclerView = findViewById(R.id.recycle_view);
        list = BookClient.getBook();
        adapterBook = new AdapterBook(list);
        recyclerView.setAdapter(adapterBook);
    }

    private void clickListeners() {
        adapterBook.setOnClick(new OnClick() {
            @Override
            public void onClickItem(int position, BookModel bookModel) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra( "key",bookModel);
                startActivity(intent);
            }
        });
    }
}