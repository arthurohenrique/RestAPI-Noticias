package com.example.REST.API.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class Service {
    public String consultarURL(String apiUrl){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
        }
        else {
            dados = "Falha ao obter dados" + responseEntity.getStatusCode();
        }

        return dados;
    }


    public String noticias(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia");
    }

    public String releases(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release");
    }

    public String noticiaseReleases(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias");
    }



}