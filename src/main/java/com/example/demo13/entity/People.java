package com.example.demo13.entity;



import lombok.Data;
//与数据库表结构相同
@Data
public class People {
    private int id;
    private String timestamp;
    private String title;
    private String type;
    private String name;
    private int importance;
    private int pageviews;
    private String status;
    private String reviewer;
}

