package com.ecommerce.microcommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Service
public class RestService {

    @Autowired
    private RestTemplate restTemplate;

    public String getPostsPlainJSON(){
        //this.setRestTemplate();
        String url = "https://swapi.co/api/planets/1";  //;"https://jsonplaceholder.typicode.com/posts/1";
        String url2 ="https://gturnquist-quoters.cfapps.io/api/random";
        return this.restTemplate.getForObject(url,String.class);
    }

}
