package com.toteall.products.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class Product {
    private String productId;
    private String name;
    private BigDecimal deliveryCharge;

    @DynamoDbPartitionKey
    public String getProductId() { return productId; }
}