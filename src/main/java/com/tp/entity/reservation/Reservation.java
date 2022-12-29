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
@Entity
@Table
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
@ManyToOne(
            fetch =  FetchType.LAZY
    )
    @MapsId("clientId")
    @NonNull
    @JoinColumn(
            name = "client_id",
            referencedColumnName = "client_id",
            foreignKey = @ForeignKey(
                    name = "client_id_fk"
            )
    )
    @ToString.Exclude
    private Client client;

    /*
     * Passager
     * */
    @ManyToOne(
            fetch =  FetchType.LAZY
    )
    @MapsId("passagerId")
    @NonNull
    @JoinColumn(
            name = "passager_id",
            referencedColumnName = "passager_id",
            foreignKey = @ForeignKey(
                    name = "passager_id_fk"
            )
    )
    @ToString.Exclude
    private Passager passager;


    /*
     * Vole
     * */
    @ManyToOne(
            fetch =  FetchType.LAZY
    )
    @MapsId("voleId")
    @NonNull
    @JoinColumn(
            name = "vole_id",
            referencedColumnName = "vole_id",
            foreignKey = @ForeignKey(
                    name = "vole_id_fk"
            )
    )
    @ToString.Exclude
    private Vole vole;

    }