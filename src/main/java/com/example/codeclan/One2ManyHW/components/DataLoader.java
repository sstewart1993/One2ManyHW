package com.example.codeclan.One2ManyHW.components;

import com.example.codeclan.One2ManyHW.models.File;
import com.example.codeclan.One2ManyHW.models.Folder;
import com.example.codeclan.One2ManyHW.models.User;
import com.example.codeclan.One2ManyHW.repository.FileRepo;
import com.example.codeclan.One2ManyHW.repository.FoldersRepo;
import com.example.codeclan.One2ManyHW.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    FileRepo fileRepo;
    @Autowired
    FoldersRepo foldersRepo;
    @Autowired
    UsersRepo usersRepo;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        User user1 = new User("BlackBeard");
        usersRepo.save(user1);
        User user2 = new User("John Cotton");
        usersRepo.save(user2);
        User user3 = new User("Alex Hamilton");
        usersRepo.save(user3);
        Folder folder1 = new Folder(user1);
        foldersRepo.save(folder1);
        Folder folder2 = new Folder(user2);
        foldersRepo.save(folder2);
        File file1 = new File("Secret", ".txt", 42, folder1);
        fileRepo.save(file1);
        File file2 = new File("Who Cares", ".txt", 500, folder2);
        fileRepo.save(file2);
    }
}
