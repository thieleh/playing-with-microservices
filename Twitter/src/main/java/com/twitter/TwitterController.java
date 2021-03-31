package com.thieleheemann.cloud.tema07.twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import twitter4j.TwitterException;

@RestController
@RequestMapping("/twitter")
public class TwitterController {

    @Autowired
    private TwitterService service;

    @RequestMapping(value = "/{user}")
    @ResponseBody
    private int getUserTweets(@PathVariable String user){
        try {
            return service.getUserTweets(user);
        } catch (TwitterException e){
            throw new ResponseStatusException(HttpStatus.valueOf(e.getStatusCode()), e.getErrorMessage());
        }
    }
}
