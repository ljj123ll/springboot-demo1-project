package com.example.demo13.controller;


import com.example.demo13.entity.People;
import com.example.demo13.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo10")
public class PeopleController {

    @Autowired(required = false)
    private PeopleService peopleService;

    /**
     * 通过id查询学生信息
     * @param id
     * @return
     */
    @RequestMapping("getInfo/{id}")
    public People getInfo( @PathVariable int id){

        return peopleService.getPeople(id);
    }

    /**
     * 插入新学生信息
     * @param people
     * @return
     */
    @RequestMapping("/insert/*")
    public People insert(People people){
        return peopleService.insertInfo(people);
    }


    /**
     * 根据id删除学生信息
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String deleteInfo(int id){
        int result = peopleService.deleteById(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    /**
     * 根据id修改学生信息
     * @param people
     * @return
     */
    @RequestMapping("/update/*")
    public String updateById(People people){
        int result = peopleService.updateById(people);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    /**
     * 查看全部学生信息
     * @return
     */
    @RequestMapping("/selectAll")
    public List<People> ListPeople(){
        return peopleService.selectAll();
    }

}

