/* package com.example.Firstproject.controller;

import com.example.Firstproject.controller.entity.jornalentry;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_jarnal")
public class jarnalentitycontroller {
    private Map<Long, jornalentry > jornalentry = new HashMap<>();


    @GetMapping
    public List<jornalentry> getall(){

        return new ArrayList<>(jornalentry.values());

    }

   @PostMapping
    public boolean createjornalentry (@RequestBody jornalentry myentity){
        jornalentry.put(myentity.getId(),myentity);
        return true;

   }
   @GetMapping("/id{myid}")
   public jornalentry getjornalentry(@PathVariable long myid){
        return jornalentry.get(myid);
   }
    @DeleteMapping("/id{myid}")
    public jornalentry deletejornalentry(@PathVariable long myid){
        return jornalentry.remove(myid);
    }

    @PutMapping("/id{id}")
    public jornalentry updatejornalentry(@PathVariable long id , @RequestBody jornalentry myentity){
        return jornalentry.put(id , myentity);
    }

}

 */
