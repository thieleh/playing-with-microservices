package com.thieleheemann.cloud.tema07.githubtwitter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GithubTwitterApplicationTests {

    @Spy
    private GithubTwitterService service;

    @Test
    public void testGetTweets() {
        Mockito.doReturn(17023).when(service).getTweets("thieleh");
        Integer totalTweets = 17023;
        Integer validTweets = service.getTweets("thieleh");
        assertEquals(totalTweets, validTweets);
    }

    @Test
    public void testGetRepositories() {
        Mockito.doReturn(21).when(service).getRepos("ilegra");
        Integer totalRepos = 21;
        Integer validRepos = service.getRepos("ilegra");
        assertEquals(totalRepos, validRepos);
    }
}
