package com.CQRSExample.CQRSExample.repository;

import com.CQRSExample.CQRSExample.model.ProductCommand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommandRepository extends JpaRepository<ProductCommand,Long> {
}
