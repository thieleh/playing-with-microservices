package com.thieleheemann.cloud.tema07.githubtwitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GithubTwitterService {

    @Autowired
    private RestTemplate restTemplate;


    public static final String TWITTER_URL = "http://localhost:8082/twitter/";
    public static final String GITHUB_URL = "http://localhost:8080/github/";


    public Integer getRepos(String userGithub) {
        try {
            return restTemplate.getForObject(GITHUB_URL + userGithub, Integer.class);
        } catch (HttpClientErrorException e) {
            throw new ResponseStatusException(e.getStatusCode(), "Unexpected error, " + e.getMessage());
        } catch (ResourceAccessException e) {
            throw new GithubException();
        }
    }

    public Integer getTweets(String userTwitter){
        try{
            return restTemplate.getForObject(TWITTER_URL + userTwitter, Integer.class);
        } catch (HttpClientErrorException e) {
            throw new ResponseStatusException(e.getStatusCode(), "Unexpected Error, " + e.getMessage());
        }catch (ResourceAccessException e){
            throw new TwitterException();
        }
    }
}
