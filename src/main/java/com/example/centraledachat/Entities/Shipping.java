package com.example.centraledachat.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.criterion.Order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.ManyToOne;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Shipping implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ShippingId;
    @ManyToOne
    Orders order;
}
