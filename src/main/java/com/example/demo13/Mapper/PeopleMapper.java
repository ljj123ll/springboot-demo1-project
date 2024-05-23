package com.example.demo13.Mapper;


import com.example.demo13.entity.People;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PeopleMapper {

    /**
     * 根据学生ID查询学生信息
     * @param id
     * @return
     */
    People getInfo(int id);

    /**
     * 插入新学生信息
     * @param people
     */
    void insertInfo(People people);


    /**
     * 根据ID删除学生信息
     * @param id
     */
    int deleteById(int id);


    /**
     * 根据id修改学生信息
     * @param people
     * @return
     */
    int updateById(People people);

    /**
     * 查询全部学生信息
     * @return
     */
    List<People> selectAll();

}
