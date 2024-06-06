package com.CQRSExample.CQRSExample.service.Impl;


import com.CQRSExample.CQRSExample.mapper.ProductQueryMapper;
import com.CQRSExample.CQRSExample.model.ProductCommand;
import com.CQRSExample.CQRSExample.model.ProductQuery;
import com.CQRSExample.CQRSExample.repository.ProductQueryRepository;
import com.CQRSExample.CQRSExample.service.ProductSyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductSyncServiceImpl implements ProductSyncService {

    private final ProductQueryRepository productQueryRepository;
    private final ProductQueryMapper productQueryMapper;

    @Override
    public void syncProduct(ProductCommand productCommand) {

        ProductQuery productQuery = productQueryMapper.ProductCommandToProductQuery(productCommand);
        productQueryRepository.save(productQuery);
    }
}
