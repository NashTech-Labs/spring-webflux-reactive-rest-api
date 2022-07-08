package com.knoldus.springwebfluxreactiverestapi.repository;

import com.knoldus.springwebfluxreactiverestapi.model.Tweet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shashikant tanti on 09/07/22.
 */
@Repository
public interface TweetRepository extends ReactiveMongoRepository<Tweet, String> {

}
