package com.example.demo13.service;


import com.example.demo13.entity.Article;
import com.example.demo13.entity.Report;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    // 实现对文章的增删改查操作，可以使用JPA或者其他持久层框架

    public List<Report> getAllReports() {
        // 实现获取所有文章的逻辑
        return null;
    }

    public Report createReport(Report Report) {
        // 实现创建文章的逻辑
        return null;
    }

    public Report updateReport(Long id, Report Report) {
        // 实现更新文章的逻辑
        return null;
    }

    public void deleteReport(Long id) {
        // 实现删除文章的逻辑
    }
}
