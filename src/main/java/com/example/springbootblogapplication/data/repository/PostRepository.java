package com.example.springbootblogapplication.data.repository;

import com.example.springbootblogapplication.data.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository    
public interface PostRepository extends MongoRepository<Post, Long> {
}
