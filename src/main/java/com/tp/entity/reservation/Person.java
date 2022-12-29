package com.tp.entity.reservation;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity(name = "Person")
@Table(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 3)
public class Person {

    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person-sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    @Column(
            name = "person_id",
            nullable = false
    )
    private Long id;

    @Column(
            name = "person_first_name",
            nullable = false
    )
    @NonNull
    private String first_name;

    @Column(
            name = "person_last_name"
    )
    @NonNull
    private String last_name;

    //ERD

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "person"
    )
    private Collection<Reservation> reservations = new ArrayList<>();

    public void reserver(Reservation reservation){
        if(!reservations.contains(reservation)){
            reservations.add(reservation);
            reservation.setPerson(this);
        }

    }
}
