package com.example.codeclan.One2ManyHW.controllers;

import com.example.codeclan.One2ManyHW.models.File;
import com.example.codeclan.One2ManyHW.repository.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilesController {

    @Autowired
    FileRepo fileRepo;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id){
        return new ResponseEntity(fileRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> postFile(@RequestBody File file){
        fileRepo.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
