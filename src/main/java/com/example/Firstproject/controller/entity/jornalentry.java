package com.example.Firstproject.controller.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class jornalentry {
    @Id
    private ObjectId id ;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;
}
