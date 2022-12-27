/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.tp.entity.vole;

import com.tp.entity.reservation.Reservation;
import jakarta.transaction.Transactional;
import lombok.*;

import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "vole")
@Entity(name = "Vole")
@ToString
public class Vole {

    @Id
//    @SequenceGenerator(
//            name = "vole_sequence",
//            sequenceName = "vole_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "vole_sequence"
//    )
    @Column(
            name = "vole_id",
            nullable = false
    )
    private Long id;

    @Column(
            name = "vole_date_depart",
            nullable = false,
            columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
    )
    @NonNull
    private LocalDateTime date_departure;

    @Column(
            name = "vole_date_arrive",
            nullable = false,
            columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
    )
    @NonNull
    private LocalDateTime  date_arrive;

    @Column(
            name = "vole_interval",
            nullable = false
    )

    private Time interval;

    //ER Party
    @OneToMany(
//            cascade = {CascadeType.PERSIST,CascadeType.REMOVE},
            mappedBy = "vole",
            fetch = FetchType.LAZY
    )
    private Collection<Reservation> list_reservation;
    @ManyToOne
//    @JoinColumn(
//            name = "vole_genirique_id",
//            columnDefinition = "id",
//            foreignKey = @ForeignKey(
//                    name = "id",
//                    foreignKeyDefinition = "vole_genirique_id_fk"
//            )
//    )
    private VoleGenirique voleGenirique;
    @ManyToOne
//    @JoinColumn(
//            name = "compagnie_id",
//            columnDefinition = "Compagnies Aerienne",
//            foreignKey = @ForeignKey(
//                    name = "id",
//                    foreignKeyDefinition = "compagnie_id_fk"
//            )
//    )
    private CompagniesAerienne compagniesAerienne;

    public void toReservation(Reservation reservation){
        reservation.setVole(this);
        list_reservation.add(reservation);
    }

}