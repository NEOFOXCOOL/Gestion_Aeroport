package com.tp.entity.vole;

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
//            cascade = {CascadeType.PERSIST,CascadeType.REMOVE},
            mappedBy = "depart",
            fetch = FetchType.LAZY
    )
    private Collection<VoleGenirique> depart_vole;


    @OneToMany(
//            cascade = {CascadeType.PERSIST,CascadeType.REMOVE},
            mappedBy = "arriver",
            fetch = FetchType.LAZY)
    private Collection<VoleGenirique> arriver_vole;

    @OneToMany(
//            cascade = {CascadeType.PERSIST,CascadeType.REMOVE},
            mappedBy = "aeroport_escale",
            fetch = FetchType.EAGER
    )
    private Collection<InfoEscale> info_escales_aeroport = new ArrayList<>();
    @ManyToOne
//    @JoinColumn(
//            name = "ville_id",
//            referencedColumnName = "name",
//            foreignKey = @ForeignKey(
//                    name = "name",
//                    foreignKeyDefinition = "ville_id_fk"
//            )
//    )
    private Ville ville;
}