package com.CQRSExample.CQRSExample.mapper;
import com.CQRSExample.CQRSExample.model.ProductCommand;
import com.CQRSExample.CQRSExample.model.ProductQuery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface ProductQueryMapper {

    ProductQuery ProductCommandToProductQuery(ProductCommand command);
}
