package com.example.thinker;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao // в классе с Аннотацией Dao мы будем описывать методы для работы с базой данных.
public interface PersonDao {
    // получить полный список персон из таблицы person
    @Query("SELECT * FROM person") // в аннотации Query прописываются соответствующие SQL-запросы
    List<Person> getAll();

    // получить конкретную персону из таблицы person по id
    @Query("SELECT * FROM person WHERE id = :id")
    Person getById(long id);

    // добавить конкретную персону в таблицу person
    @Insert
    void insert(Person person);

    // изменить конкретную персону в таблицу person
    @Update
    void update(Person person);

    // удалить конкретную персону из таблицы person
    @Delete
    void delete(Person person);
}
