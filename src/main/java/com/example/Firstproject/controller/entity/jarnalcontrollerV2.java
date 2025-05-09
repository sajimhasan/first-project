package com.example.Firstproject.controller.entity;
import com.example.Firstproject.Repository.Userrepository;
import com.example.Firstproject.service.Userservice;
import org.bson.types.ObjectId;

import com.example.Firstproject.Repository.jarnalentryrepository;
import com.example.Firstproject.service.jarnalentryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/jarnal")
public class jarnalcontrollerV2 {

    @Autowired
    private jarnalentryservice jarnalentryservice;
    @Autowired
    private jarnalentryrepository jarnalentryrepository;
    @Autowired
    private Userrepository userrepository;


    @GetMapping
    public List<jornalentry> getall(){

   return jarnalentryrepository.findAll() ;

    }

    @PostMapping ("{userName}")
    public ResponseEntity<jornalentry> createEntry (@RequestBody jornalentry myEntry, @PathVariable String userName) {
        try {

//        User user = Userservice.findbyusername(userName) ;
            jarnalentryservice.savejarnalentry (myEntry , userName ); ;
        return new ResponseEntity<>(myEntry, HttpStatus.CREATED) ;
    }
        catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
    @GetMapping("/id/{myid}")
    public ResponseEntity<jornalentry> getjornalentry(@PathVariable ObjectId myid){
        Optional<jornalentry> jornalentry = jarnalentryrepository.findById(myid);
        if (jornalentry.isPresent()){
            return new ResponseEntity<jornalentry>(jornalentry.get(), HttpStatus.OK);

        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/id/{myid}")
    public boolean deletejornalentry(@PathVariable ObjectId myid){
       jarnalentryservice.deletebyid(myid);
       return true;


    }

//    @PutMapping("/id/{id}")
//    public jornalentry updatejornalentry(@PathVariable ObjectId id , @RequestBody jornalentry newentry){
//        jornalentry old =jarnalentryservice.findid(id).orElse(null);
//
//        if ( old != null ){
//            old.setTitle(newentry.getTitle() != null && ! newentry.getTitle().equals("")? newentry.getTitle() : old.getTitle());
//            old.setContent(newentry.getContent() != null &&!  newentry.getContent().equals("")? newentry.getContent() : old.getContent());
//        }
//        jarnalentryservice.savejarnalentry(newentry, user);
//     return old ;
//    }
}
