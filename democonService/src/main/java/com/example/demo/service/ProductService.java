package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Product;

public interface ProductService {
    Product getProductById(Long id);
    void saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);
	List<Product> getAllProducts();
}