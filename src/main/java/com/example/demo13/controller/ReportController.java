package com.example.demo13.controller;


import com.example.demo13.entity.Article;
import com.example.demo13.entity.Report;
import com.example.demo13.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/menu1")
public class ReportController {

    @Autowired
    private ReportService ReportService;

    // 获取文章列表
    @GetMapping
    public List<Report> getAllReports() {
        return ReportService.getAllReports();
    }



    // 更新文章
    @PutMapping("/{id}")
    public Report updateReport(@PathVariable Long id, @RequestBody Report Report) {
        return ReportService.updateReport(id, Report);
    }

}

