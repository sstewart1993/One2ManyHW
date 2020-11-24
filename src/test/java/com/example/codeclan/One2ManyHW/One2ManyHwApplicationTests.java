//package com.example.codeclan.One2ManyHW;
//
//import com.example.codeclan.One2ManyHW.models.Folder;
//import com.example.codeclan.One2ManyHW.models.User;
//import com.example.codeclan.One2ManyHW.models.File;
//import com.example.codeclan.One2ManyHW.repository.FileRepo;
//import com.example.codeclan.One2ManyHW.repository.FoldersRepo;
//import com.example.codeclan.One2ManyHW.repository.UsersRepo;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@AutoConfigureTestDatabase
//@SpringBootTest
//class One2ManyHwApplicationTests {
//
//	@Autowired
//	FileRepo fileRepo;
//    @Autowired
//	FoldersRepo foldersRepo;
//    @Autowired
//	UsersRepo usersRepo;
//
//	@Test
//	void contextLoads() {
//	}
//
//	@Test
//	public void addUser(){
//		User user1 = new User("BlackBeard");
//		usersRepo.save(user1);
//	}
//
//	@Test
//	public void addFile(){
//		User user1 = new User("BlackBeard");
//		usersRepo.save(user1);
//		Folder folder1 = new Folder(user1);
//		foldersRepo.save(folder1);
//        File file1 = new File("abc", ".txt", 3, folder1);
//        fileRepo.save(file1);
//	}
//
//	@Test
//	public void addFolder(){
//		User user1 = new User("BlackBeard");
//		usersRepo.save(user1);
//		Folder folder2 = new Folder(user1);
//		foldersRepo.save(folder2);
//	}
//
//}
