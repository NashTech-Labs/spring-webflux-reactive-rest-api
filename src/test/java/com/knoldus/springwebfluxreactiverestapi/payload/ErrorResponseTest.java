package com.knoldus.springwebfluxreactiverestapi.payload;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ErrorResponseTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorResponse#ErrorResponse(String)}
     *   <li>{@link ErrorResponse#setMessage(String)}
     *   <li>{@link ErrorResponse#getMessage()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ErrorResponse actualErrorResponse = new ErrorResponse("trending on twitter");
        actualErrorResponse.setMessage("trending on twitter");
        assertEquals("trending on twitter", actualErrorResponse.getMessage());
    }
}

