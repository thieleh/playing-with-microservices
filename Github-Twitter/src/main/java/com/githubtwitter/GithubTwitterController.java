package com.thieleheemann.cloud.tema07.githubtwitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/counter")
@RestController
public class GithubTwitterController {

    @Autowired
    private GithubTwitterService service;

    @RequestMapping(value = "twitter/{userTwitter}/github/{userGithub}")
    public Map<String, Integer> getAll(@PathVariable String userGithub, @PathVariable String userTwitter){
        Map<String, Integer> getAll = new HashMap<>();
        getAll.put(userGithub, service.getRepos(userGithub));
        getAll.put(userTwitter, service.getTweets(userTwitter));
        return getAll;
    }


}
