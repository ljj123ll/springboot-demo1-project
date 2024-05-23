package com.example.demo13.controller;

import com.example.demo13.entity.Dept;
import com.example.demo13.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService DeptService;

    // 获取文章列表
    @GetMapping
    public List<Dept> getAllDepts() {
        return DeptService.getAllDepts();
    }

    // 创建新文章
    @PostMapping
    public Dept createDept(@RequestBody Dept Dept) {
        return DeptService.createDept(Dept);
    }

    // 更新文章
    @PutMapping("/{id}")
    public Dept updateDept(@PathVariable Long id, @RequestBody Dept Dept) {
        return DeptService.updateDept(id, Dept);
    }

    // 删除文章
    @DeleteMapping("/{id}")
    public void deleteDept(@PathVariable Long id) {
        DeptService.deleteDept(id);
    }
}

