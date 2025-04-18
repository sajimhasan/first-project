 package com.example.Firstproject.Repository;

import com.example.Firstproject.controller.entity.jornalentry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface jarnalentryrepository extends MongoRepository <jornalentry, ObjectId>{
}




