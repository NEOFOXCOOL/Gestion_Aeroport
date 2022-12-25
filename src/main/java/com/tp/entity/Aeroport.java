package com.tp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.sql.Time;
import java.util.*;


@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table
public class Aeroport {

    @Id
    private NomAeroport nom_aéroport;
    private Date date_départ;
    private Date date_arriver;
    private Time heur_départ;
    private Time heur_arriver;

    //ER Party
    @OneToMany(mappedBy = "depart",fetch = FetchType.LAZY)
    private Collection<VoleGenirique> depart_vole;
    @OneToMany(mappedBy = "arriver",fetch = FetchType.LAZY)
    private Collection<VoleGenirique> arriver_vole;
    @OneToMany(mappedBy = "aeroport_escale",fetch = FetchType.EAGER)
    private Collection<Info_Escale> info_escales_aeroport = new ArrayList<>();
    @ManyToOne
    private Ville ville;
}