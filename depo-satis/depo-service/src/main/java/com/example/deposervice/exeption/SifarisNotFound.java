package com.example.deposervice.exeption;

public class SifarisNotFound extends RuntimeException{
    public  SifarisNotFound(String message){
        super(message);
    }
}
