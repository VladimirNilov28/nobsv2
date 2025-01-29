package com.example.nobsv2.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.nobsv2.Command;

@Service
public class CreateProductService implements Command<Void, String> {


    @Override
    public ResponseEntity<String> execute(Void input) {
        // TODO Auto-generated method stub
        return ResponseEntity.status(HttpStatus.CREATED).body("product created");
    }

}
