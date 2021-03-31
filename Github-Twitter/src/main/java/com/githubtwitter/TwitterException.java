package com.thieleheemann.cloud.tema07.githubtwitter;

public class TwitterException extends RuntimeException {
    public TwitterException(){
        super("Twitter is not available now, try again later.");
    }
}
