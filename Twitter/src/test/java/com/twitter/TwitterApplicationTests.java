package com.thieleheemann.cloud.tema07.twitter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import twitter4j.TwitterException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TwitterApplicationTests {

    @Spy
    private TwitterService service;

    @Test
    void totalOfTweets() throws TwitterException {
        Mockito.doReturn(2).when(service).getUserTweets("thieleh");
        int totalExpected = 2;
        int actualTweets =
                service.getUserTweets("thieleh");
        assertEquals(totalExpected, actualTweets);
    }

}
