package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {

    @Autowired
    private RestTemplate restTemplate;

    public String getPostsPlainJSON(int i) throws Exception {
        String url = "http://gturnquist-quoters.cfapps.io/api/random";

        if (i == 1) {
            url = "http://swapi.co/api/planets/1";
        }

        try {
            return this.restTemplate.getForObject(url, String.class);
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }


}
