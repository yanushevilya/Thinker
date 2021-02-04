package com.example.thinker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            // получение базы будет выглядеть так:
            AppDatabase db = App.getInstance().getDatabase();

            // из Database объекта получаем Dao:
            PersonDao personDao = db.personDao();
            HistoryDao historyDao = db.historyDao();

            // Добавление новой персоны в базу будет выглядеть так:
            Person person = new Person();
            person.id = 1;
            person.idnum = 1;
            person.phrase = "Весь мир театр и все мы в нем актеры";
            person.id_author = 126;
            person.author = "Уильям Шекспир";

            personDao.insert(person);

            History history = new History();
            history.id = 1;
            history.id_author = 1;
            history.author = "Уильям Шекспир";
            history.century = "17 век";
            history.nation = "Англия";
            history.hist = "Развернутая история Уильяма Шекспира";
            history.shorthist = "Краткая история Уильяма Шекспира";
            history.image = "путь к картинке";

            historyDao.insert(history);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}