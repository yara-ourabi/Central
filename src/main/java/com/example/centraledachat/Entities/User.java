package com.example.centraledachat.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      Long UserId;
@ManyToMany
    List<Role> roles;
@OneToMany(mappedBy = "users")
    List<Post> posts;

@OneToOne
    FidCard fidCard;

@OneToMany(mappedBy = "user")
    List<Product> product;

@OneToMany(mappedBy = "user")
    List<Offer> offers;


}
