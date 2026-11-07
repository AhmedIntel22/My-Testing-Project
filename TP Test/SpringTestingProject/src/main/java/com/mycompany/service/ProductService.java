package com.mycompany.service;

/**
 *
 * @author ahmed
 */

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<String> getAllProducts() {
        return Arrays.asList("Laptop", "Phone");
    }
}
























