package com.tp.entity;

import lombok.*;

import jakarta.persistence.*;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Table
@Entity
@ToString
public class Ville {

    @Id
    private NomVille name;

    //ER party
    @OneToMany(
            cascade = {CascadeType.PERSIST,CascadeType.REMOVE},
            mappedBy = "ville",
            fetch = FetchType.LAZY)
     private Collection<Aeroport> aeroports;
}