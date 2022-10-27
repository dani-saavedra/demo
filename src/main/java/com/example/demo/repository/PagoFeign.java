/**
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 * <p>
 * All rights reserved Date: 3/09/2019
 */
package com.example.demo.repository;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("pagos")
public interface PagoFeign {

    @PostMapping(path = "/api/pay")
    String invoke();
}