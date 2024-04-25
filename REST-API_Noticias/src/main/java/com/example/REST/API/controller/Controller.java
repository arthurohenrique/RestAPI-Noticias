package com.example.REST.API.controller;

import com.example.REST.API.service.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Service service = new Service();


    @GetMapping("/noticias")
    public String noticias(){
        return service.noticias();
    }

    @GetMapping("/releases")
    public String releases(){
        return service.releases();
    }

    @GetMapping("/noticiasereleases")
    public String noticiasereleases(){
        return service.noticiaseReleases();
    }


}