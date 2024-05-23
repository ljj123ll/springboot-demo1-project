package com.example.demo13.controller;


import com.example.demo13.entity.Article;
import com.example.demo13.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vue-element-admin/article")
public class ArticleController {

    private final List<Article> articles;

    public ArticleController() {
        this.articles = generateMockArticles();
    }

    @GetMapping("/list")
    public ResponseEntity<Map<String, Object>> getList(
            @RequestParam(required = false) Integer importance,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String title,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "20") Integer limit,
            @RequestParam(required = false) String sort) {

        List<Article> filteredList = articles.stream()
                .filter(article -> (importance == null || article.getImportance().equals(importance)))
                .filter(article -> (type == null || article.getType().equals(type)))
                .filter(article -> (title == null || article.getTitle().contains(title)))
                .collect(Collectors.toList());

        if (sort != null && sort.equals("-id")) {
            filteredList.sort((a1, a2) -> Long.compare(a2.getId(), a1.getId()));
        }

        int total = filteredList.size();
        int startIndex = Math.min((page - 1) * limit, total);
        int endIndex = Math.min(startIndex + limit, total);
        List<Article> pageList = filteredList.subList(startIndex, endIndex);

        Map<String, Object> response = new HashMap<>();
        response.put("total", total);
        response.put("items", pageList);
        return ResponseEntity.ok(response);
    }

    // Other request handling methods, such as getting article details, updating articles, etc.
    @GetMapping("/detail/{id}")
    public ResponseEntity<Article> getDetail(@PathVariable Long id) {
        Article article = articles.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (article != null) {
            return ResponseEntity.ok(article);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<String> createArticle(@RequestBody Article article) {
        // Logic to save the article in the database or any other data store
        // Return success message or appropriate response
        return ResponseEntity.ok("Article created successfully");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateArticle(@RequestBody Article article) {
        // Logic to update the article in the database or any other data store
        // Return success message or appropriate response
        return ResponseEntity.ok("Article updated successfully");
    }

    @GetMapping("/pv")
    public ResponseEntity<Map<String, List<Map<String, Object>>>> getPVData() {
        List<Map<String, Object>> pvData = new ArrayList<>();
        // Populate pvData from articles or any other source

        Map<String, List<Map<String, Object>>> response = new HashMap<>();
        response.put("pvData", pvData);
        return ResponseEntity.ok(response);
    }

    private List<Article> generateMockArticles() {
        List<Article> articles = new ArrayList<>();
        // Generate mock data here
        // You can use loops to generate multiple articles or fetch actual data from another source
        return articles;
    }
}


