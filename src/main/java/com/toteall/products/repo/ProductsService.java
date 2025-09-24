package com.toteall.products.repo;

import com.toteall.products.dto.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductsService {
    private final DynamoDbTable<Product> productTable;

    public void save(Product product) {
        productTable.putItem(product);
    }

    public Product getById(String id) {
        return productTable.getItem(r -> r.key(k -> k.partitionValue(id)));
    }

    public List<Product> findAll() {
        return productTable.scan().items().stream().toList();
    }
}
