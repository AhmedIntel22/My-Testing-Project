package com.mycompany.service;

/**
 *
 * @author ahmed
 */

import com.mycompany.SpringTestingProjectApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@SpringBootTest(classes = SpringTestingProjectApplication.class)
@Transactional
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testServiceWithTransaction() {
        assertNotNull(productService, "The service should be injected!");
        assertFalse(productService.getAllProducts().isEmpty(), "Product list should not be empty");
    }
}


