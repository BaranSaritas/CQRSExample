package com.CQRSExample.CQRSExample.service;

import com.CQRSExample.CQRSExample.model.ProductCommand;

public interface ProductSyncService {
    void syncProduct(ProductCommand productCommand);
}
