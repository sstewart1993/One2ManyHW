package com.example.codeclan.One2ManyHW.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "folder")
    @JsonIgnoreProperties({"folders"})
    private List<File>files;

    @ManyToOne
    @JsonIgnoreProperties({"folders"})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Folder(User user) {
        this.files = new ArrayList<File>();
        this.user = user;
    }

    public Folder(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
