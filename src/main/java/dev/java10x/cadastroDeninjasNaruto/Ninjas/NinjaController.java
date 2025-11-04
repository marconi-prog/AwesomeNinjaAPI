package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasvindas(){
       return "essa e minha primeira rota";
    }
    @GetMapping("/hh")
    public String hh(){
        return "hh";
    }
}