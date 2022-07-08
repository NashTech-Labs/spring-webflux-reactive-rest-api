package com.knoldus.springwebfluxreactiverestapi.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import com.knoldus.springwebfluxreactiverestapi.exception.TweetNotFoundException;
import com.knoldus.springwebfluxreactiverestapi.model.Tweet;
import com.knoldus.springwebfluxreactiverestapi.payload.ErrorResponse;
import com.knoldus.springwebfluxreactiverestapi.repository.TweetRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {TweetController.class})
@ExtendWith(SpringExtension.class)
class TweetControllerTest {
    @Autowired
    private TweetController tweetController;

    @MockBean
    private TweetRepository tweetRepository;


    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTweets() {

        // TODO: Complete this test.

        TweetController tweetController = new TweetController();

        Tweet tweet = new Tweet();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        tweet.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        tweet.setId("42");
        tweet.setText("Text");
        tweetController.createTweets(tweet);
    }

    /**
     * Method under test: {@link TweetController#createTweets(Tweet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTweets2() {

        // TODO: Complete this test.

        TweetController tweetController = new TweetController();
        Tweet tweet = mock(Tweet.class);
        doNothing().when(tweet).setCreatedAt((Date) any());
        doNothing().when(tweet).setId((String) any());
        doNothing().when(tweet).setText((String) any());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        tweet.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        tweet.setId("42");
        tweet.setText("Text");
        tweetController.createTweets(tweet);
    }

    /**
     * Method under test: {@link TweetController#getTweetById(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTweetById() {

        (new TweetController()).getTweetById("42");
    }

    /**
     * Method under test: {@link TweetController#updateTweet(String, Tweet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateTweet() {

        TweetController tweetController = new TweetController();

        Tweet tweet = new Tweet();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        tweet.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        tweet.setId("42");
        tweet.setText("Text");
        tweetController.updateTweet("42", tweet);
    }

    /**
     * Method under test: {@link TweetController#updateTweet(String, Tweet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateTweet2() {

        TweetController tweetController = new TweetController();
        Tweet tweet = mock(Tweet.class);
        doNothing().when(tweet).setCreatedAt((Date) any());
        doNothing().when(tweet).setId((String) any());
        doNothing().when(tweet).setText((String) any());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        tweet.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        tweet.setId("42");
        tweet.setText("Text");
        tweetController.updateTweet("42", tweet);
    }

    /**
     * Method under test: {@link TweetController#deleteTweet(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteTweet() {

        ResponseEntity actualHandleDuplicateKeyExceptionResult = tweetController
                .handleDuplicateKeyException(new DuplicateKeyException("Message"));
        assertTrue(actualHandleDuplicateKeyExceptionResult.hasBody());
        assertTrue(actualHandleDuplicateKeyExceptionResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.CONFLICT, actualHandleDuplicateKeyExceptionResult.getStatusCode());
        assertEquals("A Tweet with the same text already exists",
                ((ErrorResponse) actualHandleDuplicateKeyExceptionResult.getBody()).getMessage());
    }


    /**
     * Method under test: {@link TweetController#streamAllTweets()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStreamAllTweets() {

        // TODO: Complete this test.
        ResponseEntity actualHandleTweetNotFoundExceptionResult = tweetController
                .handleTweetNotFoundException(new TweetNotFoundException("41"));
        assertNull(actualHandleTweetNotFoundExceptionResult.getBody());
        assertEquals(HttpStatus.NOT_FOUND, actualHandleTweetNotFoundExceptionResult.getStatusCode());
        assertTrue(actualHandleTweetNotFoundExceptionResult.getHeaders().isEmpty());
    }


    /**
     * Method under test: {@link TweetController#handleDuplicateKeyException(DuplicateKeyException)}
     */
    @Test
    void testHandleDuplicateKeyException() {
        ResponseEntity actualHandleDuplicateKeyExceptionResult = tweetController
                .handleDuplicateKeyException(new DuplicateKeyException("Msg"));
        assertTrue(actualHandleDuplicateKeyExceptionResult.hasBody());
        assertTrue(actualHandleDuplicateKeyExceptionResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.CONFLICT, actualHandleDuplicateKeyExceptionResult.getStatusCode());
        assertEquals("A Tweet with the same text already exists",
                ((ErrorResponse) actualHandleDuplicateKeyExceptionResult.getBody()).getMessage());
    }

    /**
     * Method under test: {@link TweetController#handleTweetNotFoundException(TweetNotFoundException)}
     */
    @Test
    void testHandleTweetNotFoundException() {
        ResponseEntity actualHandleTweetNotFoundExceptionResult = tweetController
                .handleTweetNotFoundException(new TweetNotFoundException("42"));
        assertNull(actualHandleTweetNotFoundExceptionResult.getBody());
        assertEquals(HttpStatus.NOT_FOUND, actualHandleTweetNotFoundExceptionResult.getStatusCode());
        assertTrue(actualHandleTweetNotFoundExceptionResult.getHeaders().isEmpty());
    }
}

