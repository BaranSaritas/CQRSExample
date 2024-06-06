package com.CQRSExample.CQRSExample.service.Impl;

import com.CQRSExample.CQRSExample.model.ProductQuery;
import com.CQRSExample.CQRSExample.repository.ProductQueryRepository;
import com.CQRSExample.CQRSExample.service.ProductQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductQueryServiceImpl implements ProductQueryService {

    private final ProductQueryRepository repository;

    @Override
    public List<ProductQuery> getAll(){
       return repository.findAll();
    }

    @Override
    public ProductQuery getById(Long id){
        return repository.getById(id);
    }

}
