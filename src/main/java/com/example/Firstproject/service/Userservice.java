package com.example.Firstproject.service;

import com.example.Firstproject.Repository.Userrepository;
import com.example.Firstproject.Repository.jarnalentryrepository;
import com.example.Firstproject.controller.entity.User;
import com.example.Firstproject.controller.entity.jornalentry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Userservice {
    @Autowired
    private Userrepository userrepository;

    public void savejarnalentry(User user) {
        userrepository.save(user);

    }

    public List<User> Getall(){
        return userrepository.findAll();
    }

    public Optional<User> findid(ObjectId id ){
        return userrepository.findById(id);
    }
    public void deletebyid(ObjectId id) {
        userrepository.deleteById(id);
    }
    public  User findbyusername(String username) {
        return userrepository.findByUsername(username);
    }
}

