package com.CQRSExample.CQRSExample.service;

import com.CQRSExample.CQRSExample.model.ProductCommand;
import org.springframework.transaction.annotation.Transactional;

public interface ProductCommandService {
    @Transactional("commandTransactionManager")
    ProductCommand createProduct(ProductCommand product);
}
