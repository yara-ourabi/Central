package com.example.centraledachat.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Promotion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long PromotionId;
@OneToMany(mappedBy = "promotion")
    List<Event> events;

    @OneToMany(mappedBy="promotion")
     List<Orders> orders;

    @OneToMany( mappedBy="promotion")
     List<Product> Products;

}
