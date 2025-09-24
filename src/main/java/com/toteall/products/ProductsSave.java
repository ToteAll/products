package com.toteall.products;

import com.toteall.products.dto.Product;
import com.toteall.products.repo.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Component
public class ProductsSave implements CommandLineRunner {

    private final ProductsService productsService;

    @Override
    public void run(String... args) throws Exception {
      //  productsService.save(Product.builder().productId("Prd-03").name("Big TV").deliveryCharge(BigDecimal.TEN).build());
    }
}
