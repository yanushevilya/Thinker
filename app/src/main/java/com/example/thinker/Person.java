package com.example.thinker;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity // Аннотацией Entity нам необходимо пометить объект, который мы хотим хранить в базе данных
public class Person {

    @PrimaryKey // Аннотацией PrimaryKey мы помечаем поле, которое будет ключом в таблице.
    public long id;

    public Integer idnum;
    public String phrase;
    public Integer id_author;
    public String author;

}
