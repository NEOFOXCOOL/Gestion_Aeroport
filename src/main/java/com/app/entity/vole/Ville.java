package com.app.entity.vole;

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
            cascade = CascadeType.ALL,
            mappedBy = "ville",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
     private Collection<Aeroport> aeroports;
}