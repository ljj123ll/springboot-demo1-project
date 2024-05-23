package com.example.demo13.service;


import com.example.demo13.entity.People;
import java.util.List;

public interface PeopleService {

    People getPeople(int id);

    People insertInfo(People people);

    int deleteById(int id);

    int updateById(People people);

    List<People> selectAll();
}

