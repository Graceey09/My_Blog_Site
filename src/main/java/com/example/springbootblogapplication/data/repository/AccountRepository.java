package com.example.springbootblogapplication.data.repository;

import com.example.springbootblogapplication.data.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository< Account, Long> {
}
