package com.app.manager.entity.vole;

import lombok.*;

import jakarta.persistence.*;
import java.sql.Time;
import java.time.DayOfWeek;
import java.util.Collection;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "VoleGenirique")
@Table(name = "volegenirique")
@ToString
public class VoleGenirique {

    @Id
    @SequenceGenerator(
            name = "colegenirique_sequence",
            sequenceName = "colegenirique_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "colegenirique_sequence"
    )
    @Column(
            name = "vole_genirique_id",
            nullable = false
    )
    private Long id;

    @Column(
            name = "day_of_vol",
            nullable = false
    )
    private DayOfWeek jour;

    @Column(
           name = "vole_depart",
            nullable = false
    )
    private Time hour_depart;

    @Column(
            name = "vole_arrive",
            nullable = false
    )
    private Time hour_arrive;

    @Column(
            name = "vole_intervale",
            nullable = false
    )
    private Time intervale;

    @Column(
            name = "vole_validation",
            nullable = false
    )
    private Time validation_time;

    //ER Party
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "voleGenirique",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private Collection<Vole> vole;

    @ManyToOne
    private Aeroport depart;

    @ManyToOne
    private Aeroport arriver;


    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "vole_escale",
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private Collection<InfoEscale> info_escales_vole;
    // à triter
    @OneToOne
    private CompagniesAerienne compagniesAerienne;
}