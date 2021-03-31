package com.thieleheemann.cloud.tema07.twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.TwitterException;

@Service
public class TwitterService {

    @Autowired
    private TwitterAPI twitterAPI;

    public int getUserTweets(String user) throws TwitterException {
        return twitterAPI.getInstanceOfTwitter().showUser(user).getStatusesCount();
    }
}
