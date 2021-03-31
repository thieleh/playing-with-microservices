package com.thieleheemann.cloud.tema07.github.exceptions;

public class GitHubException extends RuntimeException {
    public GitHubException() {
        super("GitHub server is not available now, try again later.");
    }
}
