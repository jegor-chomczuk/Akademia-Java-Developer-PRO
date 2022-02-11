package com.newsapi.zadanieaplikacyjne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@RestController
public class Controller {

    @Autowired
    Service service;

    String apiKey = "0feb907b0d7742858ab1c5a4e3aaeecd";
    String uri = "https://newsapi.org/v2/top-headlines?category=business&country=pl&apiKey=";
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/news")
    @ResponseStatus(HttpStatus.OK)
    public void getBusinessNewsFromPoland() throws IOException {
        Writer writer = new FileWriter("news.txt", false);

        String result = restTemplate.getForObject(uri + apiKey, String.class);

        String[] newsArray = service.trimResponse(result);
        for (int i = 1; i < newsArray.length; i++) {
            writer.write(newsArray[i] + "\n");
        }
    }
}
