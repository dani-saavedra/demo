package com.example.demo.controller;

import com.example.demo.repository.PagoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClienteController {

    @Autowired
    private PagoFeign pagoProxy;

    @GetMapping("/cliente")
    public String pagar() {
        String forObject = pagoProxy.invoke();
        return "Ya pague " + forObject;
    }
}
