package com.example.lab9gtics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping(value = "/inicio")

public class InicioController {

    @GetMapping(value = "")
    public String inicio() {

        return "iniciopagina";
    }

}