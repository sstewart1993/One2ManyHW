package com.example.codeclan.One2ManyHW.controllers;

import com.example.codeclan.One2ManyHW.models.Folder;
import com.example.codeclan.One2ManyHW.repository.FoldersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FoldersRepo foldersRepo;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(foldersRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id){
        return new ResponseEntity(foldersRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/folders")
    public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
        foldersRepo.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}
