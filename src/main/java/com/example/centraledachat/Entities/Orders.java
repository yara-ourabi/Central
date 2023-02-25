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
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long OrderId;

    @ManyToMany(mappedBy="ordersList")
    List<Product> productList;

    @OneToMany( mappedBy="order")
     List<Shipping> shippings;

    @OneToMany(mappedBy="order")
     List<Reclamation> reclamations;

    @ManyToOne
    Promotion promotion;

}
