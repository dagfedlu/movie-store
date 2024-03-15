package com.movies.backend.models;

import jakarta.persistence.*;
import java.util.Set;
import lombok.*;

@Entity
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
