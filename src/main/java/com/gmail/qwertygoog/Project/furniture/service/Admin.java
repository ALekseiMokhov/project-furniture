package com.gmail.qwertygoog.Project.furniture.service;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Admin {
    @Id
    private final Integer id =1;
    private static Admin INSTANCE;
    @NonNull
    private String password;
    private Admin() {
    }
    public Admin getInstance(){
        if (INSTANCE==null) INSTANCE = new Admin();
        return INSTANCE;
    }


}
