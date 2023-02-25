package com.example.centraledachat.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tender implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long TenderId;

    @ManyToOne
    Product product;

    @OneToMany(cascade = CascadeType.ALL)
     List<Offer> Offers;
}
