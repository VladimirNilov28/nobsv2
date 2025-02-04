package com.example.nobsv2.product.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.nobsv2.Command;
import com.example.nobsv2.product.model.Product;
import com.example.nobsv2.product.model.ProductRepository;

@Service
public class DeleteProductService implements Command<Integer, Void> {

    private final ProductRepository productRepository;
    
    public DeleteProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    @Override
    public ResponseEntity<Void> execute(Integer id) {
        Optional<Product> producOptional = productRepository.findById(id);
        if(producOptional.isPresent()){
            productRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }


        return null;
    }

}
