package com.tp.entity.vole;

import lombok.*;

import jakarta.persistence.*;
import java.sql.Time;
import java.time.DayOfWeek;
import java.util.ArrayList;
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
//    @SequenceGenerator(
//            name = "colegenirique_sequence",
//            sequenceName = "colegenirique_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "colegenirique_sequence"
//    )
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
//            cascade = {CascadeType.PERSIST,CascadeType.REMOVE},
            mappedBy = "voleGenirique",
            fetch = FetchType.LAZY
    )
    private Collection<Vole> vole;
    @ManyToOne
//    @JoinColumn(
//            name = "aeroport_depart",
//            referencedColumnName = "aeroport_id",
//            foreignKey = @ForeignKey(
//                    name = "aeroport_id",
//                    foreignKeyDefinition = "aeroport_depart_fk"
//            )
//    )
    private Aeroport depart;
    @ManyToOne
//    @JoinColumn(
//            name = "aeroport_arrive",
//            referencedColumnName = "aeroport_id",
//            foreignKey = @ForeignKey(
//                    name = "aeroport_id",
//                    foreignKeyDefinition = "aeroport_arrive_fk"
//            )
//    )
    private Aeroport arriver;


    @OneToMany(
//            cascade = {CascadeType.PERSIST,CascadeType.REMOVE},
            mappedBy = "vole_escale",
            fetch = FetchType.EAGER
    )
    private Collection<InfoEscale> info_escales_vole = new ArrayList<>();

    // à triter
    @OneToOne
//    @JoinColumn(
//            name = "vole_genirique_id",
//            referencedColumnName = "id",
//            foreignKey = @ForeignKey(
//                    name = "id",
//                    foreignKeyDefinition = "vole_genirique_id_fk"
//            )
//    )
    private CompagniesAerienne compagniesAerienne;
}