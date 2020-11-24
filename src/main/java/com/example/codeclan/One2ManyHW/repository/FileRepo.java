package com.example.codeclan.One2ManyHW.repository;

import com.example.codeclan.One2ManyHW.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<File, Long> {
}
