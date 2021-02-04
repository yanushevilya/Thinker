package com.example.thinker;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity // Аннотацией Entity нам необходимо пометить объект, который мы хотим хранить в базе данных
public class History {

    @PrimaryKey // Аннотацией PrimaryKey мы помечаем поле, которое будет ключом в таблице.
    public long id;

    public Integer id_author;
    public String author;
    public String century;
    public String nation;
    public String hist;
    public String shorthist;
    public String image;

}
