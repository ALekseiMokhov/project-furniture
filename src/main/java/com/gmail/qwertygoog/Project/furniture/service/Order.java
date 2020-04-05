package com.gmail.qwertygoog.Project.furniture.service;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int totalPrice;
    @OneToMany(targetEntity = Furniture.class,cascade = CascadeType.ALL)
    private List <Furniture> listOfFurni;
    private LocalDateTime dateTime;
    @PrePersist
    private void dateSetting(){
        this.dateTime = LocalDateTime.now();
    }
}
