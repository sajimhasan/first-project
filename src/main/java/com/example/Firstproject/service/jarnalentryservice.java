package com.example.Firstproject.service;

import com.example.Firstproject.Repository.jarnalentryrepository;
import com.example.Firstproject.controller.entity.User;
import com.example.Firstproject.controller.entity.jornalentry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class jarnalentryservice {
    @Autowired
    private jarnalentryrepository jarnalentryrepository;

    public void savejarnalentry(jornalentry jarnalentry) {
        jarnalentryrepository.save(jarnalentry);

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

