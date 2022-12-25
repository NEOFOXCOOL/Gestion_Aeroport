package com.tp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor  @AllArgsConstructor
@Entity
@Table

public class Reservation {

            @Id
            @SequenceGenerator(
                    name = "reservationsequence",
                    sequenceName = "reservationsequence",
                    allocationSize = 1
            )
            @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "reservationsequence"
            )
            private long num_réservation;
            private LocalDate date_réservation;

            //ER party
    @ManyToOne
            private Client client;
    @ManyToOne
            private Passager passager;
    @ManyToOne
            private Vole vole;
    }