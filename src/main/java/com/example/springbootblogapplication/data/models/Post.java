package com.example.springbootblogapplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Data
public class Post {
    @Id
    private Long id;
    private LocalDateTime createdOn;


}
