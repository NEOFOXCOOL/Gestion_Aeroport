package com.tp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.sql.Time;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collection;


@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table

public class VoleGenirique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num_de_vole;
    private DayOfWeek jour;
    private Time hourDépart;
    private Time hourArrivée;
    private Time durée;
    private Time périodeValidit;

    //ER Party
    @OneToMany(mappedBy = "voleGenirique",fetch = FetchType.LAZY)
    private Collection<Vole> vole;
    @ManyToOne
    private Aeroport depart;
    @ManyToOne
    private Aeroport arriver;
    @OneToMany(mappedBy = "vole_escale",fetch = FetchType.EAGER)
    private Collection<Info_Escale> info_escales_vole = new ArrayList<>();

    // à triter
    @OneToOne
    private CompagniesAerienne compagniesAerienne;
}