package com.example.demo13.service.impl;


import com.example.demo13.entity.People;
import com.example.demo13.Mapper.PeopleMapper;
import com.example.demo13.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired(required = false)
    private PeopleMapper peopleMapper;

    @Override
    public People getPeople(int id){
        return peopleMapper.getInfo(id);
    }

    @Override
    public People insertInfo(People people){
        peopleMapper.insertInfo(people);
        return people;
    }

    @Override
    public int deleteById(int id){
        return peopleMapper.deleteById(id);
    }

    @Override
    public int updateById(People people){
        return peopleMapper.updateById(people);
    }

    @Override
    public List<People> selectAll(){
        return peopleMapper.selectAll();
    }
}

