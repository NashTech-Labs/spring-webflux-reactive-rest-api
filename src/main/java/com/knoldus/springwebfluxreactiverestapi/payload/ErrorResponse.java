package com.knoldus.springwebfluxreactiverestapi.payload;

/**
 * Created by shashikant Tanti on 08/07/22.
 */

public class ErrorResponse {

        private String message;

    /**
     * to respond String type message
     * @param message parameter
     */
        public ErrorResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
}
