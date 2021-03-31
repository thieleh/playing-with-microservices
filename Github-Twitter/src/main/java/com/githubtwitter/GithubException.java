package com.thieleheemann.cloud.tema07.githubtwitter;

public class GithubException extends RuntimeException {
    public GithubException(){
        super("Github is not available now, try again later.");
    }
}
