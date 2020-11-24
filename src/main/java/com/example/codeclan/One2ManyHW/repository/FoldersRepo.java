package com.example.codeclan.One2ManyHW.repository;

import com.example.codeclan.One2ManyHW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoldersRepo extends JpaRepository<Folder, Long> {
}
