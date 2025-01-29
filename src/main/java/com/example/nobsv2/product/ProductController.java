package com.example.nobsv2.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {

    
    private final CreateProductService createProductService;
    private final GetProductService getProductService;
    private final UpdateProductService updateProductService;
    private final DeleteProductService deleteProductService;

    public ProductController(CreateProductService createProductService,
                             DeleteProductService deleteProductService,
                             GetProductService getProductService,
                             UpdateProductService updateProductService) {
        this.createProductService = createProductService;
        this.deleteProductService = deleteProductService;
        this.getProductService = getProductService;
        this.updateProductService = updateProductService;
    }

    @PostMapping
    public ResponseEntity<String> createProduct(){
        return createProductService.execute(null);
    }


    @GetMapping
    public ResponseEntity<String> getProduct(){
        return getProductService.execute(null);
    }


    @PutMapping
    public ResponseEntity<String> updateProduct(){
        return updateProductService.execute(null);
    }


    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return deleteProductService.execute(null);
    }

}
