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
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long PostId;
    @ManyToOne
    User users;

    @OneToMany(mappedBy = "posts")
    List<Comment> comments;

    @OneToMany(mappedBy = "posts")
    List<Rating> ratings;


}
