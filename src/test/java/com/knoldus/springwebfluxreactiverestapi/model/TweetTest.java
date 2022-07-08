package com.knoldus.springwebfluxreactiverestapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import org.junit.jupiter.api.Test;

class TweetTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Tweet#Tweet()}
     *   <li>{@link Tweet#setCreatedAt(Date)}
     *   <li>{@link Tweet#setId(String)}
     *   <li>{@link Tweet#setText(String)}
     *   <li>{@link Tweet#getCreatedAt()}
     *   <li>{@link Tweet#getId()}
     *   <li>{@link Tweet#getText()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Tweet actualTweet = new Tweet();
        LocalDateTime atStartOfDayResult = LocalDate.of(1971, 2, 2).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualTweet.setCreatedAt(fromResult);
        actualTweet.setId("41");
        actualTweet.setText("TextMessage");
        assertSame(fromResult, actualTweet.getCreatedAt());
        assertEquals("41", actualTweet.getId());
        assertEquals("TextMessage", actualTweet.getText());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Tweet#Tweet(String)}
     *   <li>{@link Tweet#setCreatedAt(Date)}
     *   <li>{@link Tweet#setId(String)}
     *   <li>{@link Tweet#setText(String)}
     *   <li>{@link Tweet#getCreatedAt()}
     *   <li>{@link Tweet#getId()}
     *   <li>{@link Tweet#getText()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Tweet actualTweet = new Tweet("Text");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualTweet.setCreatedAt(fromResult);
        actualTweet.setId("42");
        actualTweet.setText("msg");
        assertSame(fromResult, actualTweet.getCreatedAt());
        assertEquals("42", actualTweet.getId());
        assertEquals("msg", actualTweet.getText());
    }
}

