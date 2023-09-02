package com.company.entity;


import java.io.Serializable;
import java.util.ArrayList;

import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name="symptom")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Symptom implements Serializable {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    @Id
    Long id;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "illness_id",referencedColumnName = "id",nullable = false)
    Illness illness;
    @Column(name="name")
    String name;
}
