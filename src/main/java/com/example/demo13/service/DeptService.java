package com.example.demo13.service;


import com.example.demo13.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    // 实现对文章的增删改查操作，可以使用JPA或者其他持久层框架

    public List<Dept> getAllDepts() {
        // 实现获取所有文章的逻辑
        return null;
    }

    public Dept createDept(Dept Dept) {
        // 实现创建文章的逻辑
        return null;
    }

    public Dept updateDept(Long id, Dept Dept) {
        // 实现更新文章的逻辑
        return null;
    }

    public void deleteDept(Long id) {
        // 实现删除文章的逻辑
    }
}
