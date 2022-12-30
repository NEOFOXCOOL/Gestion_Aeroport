package com.tp.entity.reservation;

import com.tp.entity.vole.Vole;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "Reservation")
@Table(name = "reservation")
@ToString
public class Reservation {

    @EmbeddedId
    private ReservationID id;


    @Column(
                    name = "date_reservation",
                    nullable = false,
                    columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
            )
            private LocalDateTime date_reservation = LocalDateTime.now();


        /*
        * Client
        * */
    @ManyToOne()
    @MapsId("client_id")
    @NonNull
    @JoinColumn(
            name = "client_id",
            foreignKey = @ForeignKey(
                    name = "client_id_fk"
            )
    )
    @ToString.Exclude
    private Client client;

    /*
     * Passager
     * */
    @ManyToOne()
    @MapsId("passager_id")
    @NonNull
    @JoinColumn(
            name = "passager_id",
            foreignKey = @ForeignKey(
                    name = "passager_id_fk"
            )
    )
    @ToString.Exclude
    private Passager passager;


    /*
     * Vole
     * */
    @ManyToOne()
    @MapsId("vole_id")
    @NonNull
    @JoinColumn(
            name = "vole_id",
            foreignKey = @ForeignKey(
                    name = "vole_id_fk"
            )
    )
    @ToString.Exclude
    private Vole vole;

    }