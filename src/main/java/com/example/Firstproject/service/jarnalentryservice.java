package com.example.Firstproject.service;

import com.example.Firstproject.Repository.jarnalentryrepository;
import com.example.Firstproject.controller.entity.User;
import com.example.Firstproject.controller.entity.jornalentry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class jarnalentryservice {
    @Autowired
    private jarnalentryrepository jarnalentryrepository;

    @Autowired
    private Userservice userservice;

    public void savejarnalentry(jornalentry jarnalentry, String username) {
        jarnalentryrepository.save(jarnalentry);
        User user = Userservice.findbyusername(username) ;
        jarnalentryrepository.save(jarnalentry);

       jarnalentry.setDate(LocalDateTime.now());

    }
    public List<jornalentry> Getall(){
        return jarnalentryrepository.findAll();
    }
    public Optional<jornalentry> findid(ObjectId id ){
        return jarnalentryrepository.findById(id);
    }
    public void deletebyid(ObjectId id) {
        jarnalentryrepository.deleteById(id);
    }
}

