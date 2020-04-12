package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private Object ArrayList;

    @GetMapping("/ping")
    public ResponseEntity<Object> ping(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("alive", true);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }





  public ArrayList retorno(int numero){
           int x=0;
        ArrayList VECTOR=new ArrayList();
           int soma=2;

           for(;soma<=numero;){
                 VECTOR.add(2);
                 soma=soma*2;
           }
           return VECTOR;
    }



}
