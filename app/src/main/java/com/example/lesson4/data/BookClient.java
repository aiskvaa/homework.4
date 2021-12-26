package com.example.lesson4.data;

import com.example.lesson4.model.BookModel;

import java.util.ArrayList;

public class BookClient {
    public static ArrayList<BookModel> list = new ArrayList<>();

    public static ArrayList<BookModel> getBook(){
        list.add(new BookModel("Пицца", "Продукты" +
                "Для теста:" +
                "Яйцо - 1 шт." +
                "Мука - 2-2,5 стакана" +
                "Масло растительное - 2 ст. л." +
                "Вода - 200 мл" +
                "Соль - 1 ч. л." +
                "Сахар - 1 ст. л." +

                "Для начинки:" +
                "Сыр моцарелла - 300 г" +
                "Сыр твердый - 200 г" +
                "Помидоры - 2-3 шт." +
                "Колбаса вареная - 200-250 г" +
                "Колбаса копченая" +
                "Грибы шампиньоны" +
                "Соус томатный", "Апетитная"));
        list.add(new BookModel("GeekTech", "Kara-Balta", "Пипирони"));

        return list;
    }

}
