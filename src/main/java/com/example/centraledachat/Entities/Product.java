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

public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ProduitId;
    @ManyToOne
    User user;

    @ManyToMany
     List<Orders> ordersList;

    @OneToMany( mappedBy="product")
     List<Tender> Tenders;

    @ManyToOne
    Category category;

    @ManyToOne
    Promotion promotion;
}
