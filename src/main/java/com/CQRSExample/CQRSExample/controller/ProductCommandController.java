package com.CQRSExample.CQRSExample.controller;

import com.CQRSExample.CQRSExample.model.ProductCommand;
import com.CQRSExample.CQRSExample.service.ProductCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/commands/products")
public class ProductCommandController {

    private ProductCommandService service;
    @PostMapping
    public ProductCommand createProduct(@RequestBody ProductCommand product) {
        return service.createProduct(product);
    }
}