package com.thieleheemann.cloud.tema07;

import com.thieleheemann.cloud.tema07.github.GithubConfig;
import com.thieleheemann.cloud.tema07.github.service.GithubService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = {GithubConfig.class})
class GithubTest {

    @Spy
    private GithubService service;

    @Test
    public void totalOfRepositories() {
        Mockito.doReturn(2).when(service).getUserRepositories("thieleh");
        int totalExpected = 2;
        int actualTotal = service.getUserRepositories("thieleh");
        assertEquals(totalExpected, actualTotal);
    }
}
