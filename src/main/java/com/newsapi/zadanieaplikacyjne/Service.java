package com.newsapi.zadanieaplikacyjne;

@org.springframework.stereotype.Service
public class Service {

    public String[] trimResponse(String response){
        String [] array = response.split("source");
        return array;
    }
}
