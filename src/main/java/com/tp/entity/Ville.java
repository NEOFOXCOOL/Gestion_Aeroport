package com.tp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Table
@Entity

public class Ville {

    @Id
    private NomVille nom_ville;

    //ER party
    @OneToMany(mappedBy = "ville",fetch = FetchType.LAZY)
     private Collection<Aeroport> aeroports;
}