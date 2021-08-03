package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.entity.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {

}
