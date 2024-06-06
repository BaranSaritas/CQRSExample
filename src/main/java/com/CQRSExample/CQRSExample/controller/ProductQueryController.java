package com.CQRSExample.CQRSExample.controller;

import com.CQRSExample.CQRSExample.model.ProductQuery;
import com.CQRSExample.CQRSExample.service.ProductQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/queries/products")
public class ProductQueryController {


    private ProductQueryService service;

    @GetMapping
    public List<ProductQuery> getAllProducts() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProductQuery getProductById(@PathVariable Long id) {
        return service.getById(id);
    }
}