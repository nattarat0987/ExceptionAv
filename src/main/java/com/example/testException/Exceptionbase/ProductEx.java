package com.example.testException.Exceptionbase;

public class ProductEx extends Ex{
    public ProductEx(String message) {
        super(message);
    }
    public static ProductEx notfound(){
        return new ProductEx("notfound");
    }
}
