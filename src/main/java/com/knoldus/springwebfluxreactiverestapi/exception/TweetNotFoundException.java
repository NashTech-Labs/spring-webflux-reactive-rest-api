package com.knoldus.springwebfluxreactiverestapi.exception;
/**
 * Created by shashikant Tanti on 08/07/22.
 */
    public class TweetNotFoundException extends RuntimeException {

        public TweetNotFoundException(String tweetId) {
            super("Tweet not found with id " + tweetId);
        }
}
