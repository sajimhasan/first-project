package com.example.Firstproject.controller.entity;

import com.example.Firstproject.Repository.Userrepository;
import com.example.Firstproject.Repository.jarnalentryrepository;
import com.example.Firstproject.service.Userservice;
import com.example.Firstproject.service.jarnalentryservice;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class usercontroller {

@Autowired
private Userservice userservice;
    @Autowired
    private Userrepository userrepository;

    @GetMapping
public List<User> Getall(){
    return userservice.Getall();
}
@PostMapping
public ResponseEntity<String> createuser(@RequestBody User user , @PathVariable String Username){
    userservice.savejarnalentry(user);
    return ResponseEntity.ok("USER IS CREATED");
}

@PutMapping
public ResponseEntity<?> userupdate(@RequestBody User user){

    User Userindb= userservice.findbyusername(user.getUsername());
     if (Userindb !=null){
         Userindb.setUsername(user.getUsername());
         Userindb.setPassword(user.getPassword());
         userservice.savejarnalentry(Userindb);
     }

     return new ResponseEntity<>(HttpStatus.NO_CONTENT);

}

}
