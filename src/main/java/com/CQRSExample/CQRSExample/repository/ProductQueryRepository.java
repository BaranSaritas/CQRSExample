package com.CQRSExample.CQRSExample.repository;

import com.CQRSExample.CQRSExample.model.ProductQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductQueryRepository extends JpaRepository<ProductQuery,Long> {
}
