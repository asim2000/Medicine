package com.company.entity;

import java.io.Serializable;
import java.util.ArrayList;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="illness")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Illness implements Serializable {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    @Id
    Long id;
    
    @Column(name="name")
    String name;
    
    @Override
    public String toString() {
        return name;
    }
    @OneToMany(mappedBy = "illness",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Symptom> symptoms;

}

