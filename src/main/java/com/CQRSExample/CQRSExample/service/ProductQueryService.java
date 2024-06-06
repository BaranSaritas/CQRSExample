package com.CQRSExample.CQRSExample.service;

import com.CQRSExample.CQRSExample.model.ProductQuery;

import java.util.List;

public interface ProductQueryService {
    List<ProductQuery> getAll();

    ProductQuery getById(Long id);
}
