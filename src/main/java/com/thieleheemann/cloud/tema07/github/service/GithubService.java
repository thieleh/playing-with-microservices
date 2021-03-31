package com.thieleheemann.cloud.tema07.github.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.thieleheemann.cloud.tema07.github.exceptions.GitHubException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubService {
    private static final String GITHUB_API = "https://api.github.com/users/";

    @Autowired
    private RestTemplate restTemplate;

    public int getUserRepositories(String user){
        try {
            String userRepositories = restTemplate.getForObject(GITHUB_API + user + "/repos", String.class);
            JsonArray arrayUserRepositories = JsonParser.parseString(userRepositories).getAsJsonArray();
            return arrayUserRepositories.size();
        } catch (ResourceAccessException e){
            throw new GitHubException();
        }
    }
}
