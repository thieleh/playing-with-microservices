package com.thieleheemann.cloud.tema07.github.controller;


import com.thieleheemann.cloud.tema07.github.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/github")
public class GithubController {

    @Autowired
    private GithubService service;

    @RequestMapping(value = "/{user}")
    @ResponseBody
    private int getUserResponse(@PathVariable String user){
        try {
            return service.getUserRepositories(user);
        } catch (HttpClientErrorException e){
            throw new ResponseStatusException(e.getStatusCode(), "ERROR, " +  e.getMessage());
        }
    }

}
