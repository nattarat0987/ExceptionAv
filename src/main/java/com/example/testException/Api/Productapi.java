package com.example.testException.Api;


import com.example.testException.Exceptionbase.ProductEx;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Productapi {


    @GetMapping("/product/{id}")
    public ResponseEntity<String> testproduct(@PathVariable Long id) throws ProductEx {
        if (!(id<1 && id>1)) {
            throw ProductEx.notfound();
        }
        return ResponseEntity.ok("product_1");

    }
}
