package com.example.centraledachat.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class FidCard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long FidCardId;

    @OneToOne(mappedBy = "fidCard")
    User user;
}
