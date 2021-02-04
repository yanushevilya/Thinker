package com.example.thinker;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao // в классе с Аннотацией Dao мы будем описывать методы для работы с базой данных.
public interface HistoryDao {
    // получить полный список историй из таблицы history
    @Query("SELECT * FROM history") // в аннотации Query прописываются соответствующие SQL-запросы
    List<Person> getAll();

    // получить конкретную история из таблицы history по id
    @Query("SELECT * FROM history WHERE id = :id")
    Person getById(long id);

    // добавить конкретную историю в таблицу history
    @Insert
    void insert(History history);

    // изменить конкретную историю в таблицу history
    @Update
    void update(History history);

    // удалить конкретную историю из таблицы history
    @Delete
    void delete(History history);
}
