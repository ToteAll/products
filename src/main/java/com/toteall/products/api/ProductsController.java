package com.toteall.products.api;

import com.toteall.products.dto.Product;
import com.toteall.products.repo.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class ProductsController {

    private final ProductsRepository productsRepository;

    @GetMapping("products")
    public List<Product> getProducts() {
        return productsRepository.findAll();
    }
}
