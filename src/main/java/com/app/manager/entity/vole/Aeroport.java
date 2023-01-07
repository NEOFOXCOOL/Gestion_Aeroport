package com.app.manager.entity.vole;

import lombok.*;

import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Aeroport")
@Table(name = "aeroport")
@ToString
public class Aeroport {

    @Id
    @Column(
            name = "aeroport_id",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private NomAeroport id;

    @Column(
            name = "aeroport_date_depart",
            nullable = false
    )
    private LocalDateTime date_depart;

    @Column(
            name = "aeroport_date_arrive",
            nullable = false
    )
    private LocalDateTime date_arrive;

    @Column(
            name = "aeroport_heur_dapart",
            nullable = false
    )
    private Time heur_depart;

    @Column(
            name = "aeroport_heur_arrive",
            nullable = false
    )
    private Time heur_arrive;

    //ER Party
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "depart",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private Collection<VoleGenirique> depart_vole;


    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "arriver",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private Collection<VoleGenirique> arriver_vole;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "aeroport_escale",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private Collection<InfoEscale> info_escales_aeroport;
    @ManyToOne
    private Ville ville;
}