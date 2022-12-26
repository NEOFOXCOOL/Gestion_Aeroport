package com.tp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@ToString
public class Reservation {

            @Id
            @SequenceGenerator(
                    name = "reservation_sequence",
                    sequenceName = "reservation_sequence",
                    allocationSize = 1
            )
            @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "reservation_sequence"
            )
            @Column(
                    name = "reservation_id",
                    nullable = false,
                    updatable = false,
                    insertable = false
            )
            private long num_reservation;

            @Column(
                    name = "date_reservation",
                    nullable = false,
                    columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
            )
            private LocalDateTime date_reservation = LocalDateTime.now();

            //ER party
    @ManyToOne
    @JoinColumn(
            name = "client_id",
            updatable = false,
            insertable = false,
            foreignKey = @ForeignKey(
                    name = "id",
                    foreignKeyDefinition = "client_id_fk")
    )
            private Client client;

    @ManyToOne
    @JoinColumn(
            name = "passager_id",
            updatable = false,
            insertable = false,
            foreignKey = @ForeignKey(
                    name = "id",
                    foreignKeyDefinition = "passager_id_fk")
    )
            private Passager passager;
    @ManyToOne
    @JoinColumn(
            name = "vole_id",
            updatable = false,
            insertable = false,
            foreignKey = @ForeignKey(
                    name = "id",
                    foreignKeyDefinition = "vole_id_fk")
    )
            private Vole vole;


    public Reservation(
            Client client,
            Passager passager,
            Vole vole
    )
    {
client = this.client;
passager=this.passager;
vole = this.vole;
    }
    }