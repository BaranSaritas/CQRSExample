package com.CQRSExample.CQRSExample.service.Impl;

import com.CQRSExample.CQRSExample.model.ProductCommand;
import com.CQRSExample.CQRSExample.repository.ProductCommandRepository;
import com.CQRSExample.CQRSExample.service.ProductCommandService;
import com.CQRSExample.CQRSExample.service.ProductSyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductCommandServiceImpl implements ProductCommandService {

    private final ProductCommandRepository repository;

    private final ProductSyncService productSyncService;


    // olusturulan product ile read tablosunu gunceleme islemi yapiyorum

    @Override
    @Transactional("commandTransactionManager")
    public ProductCommand createProduct(ProductCommand product){
        ProductCommand savedProductCommand = repository.save(product);
        productSyncService.syncProduct(savedProductCommand);
        return savedProductCommand;
    }

}
