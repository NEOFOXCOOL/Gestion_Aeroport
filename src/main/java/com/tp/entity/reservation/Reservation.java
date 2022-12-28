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
                    nullable = false
            )
            private long num_reservation;

            @Column(
                    name = "date_reservation",
                    nullable = false,
                    columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
            )
            private LocalDateTime date_reservation = LocalDateTime.now();

                    //ER party
            @ManyToOne(
                    fetch = FetchType.LAZY
            )
            @JoinColumn(
                    name = "client_id",
                    referencedColumnName = "client_id",
                    foreignKey = @ForeignKey(
                            name = "client_id_fk"
                    )
            )
            @NonNull
                    private Client client;

            @ManyToOne(
                    fetch = FetchType.LAZY
            )
            @NonNull
            @JoinColumn(
                    name = "passager_id",
                    referencedColumnName = "passager_id",
                    foreignKey = @ForeignKey(
                            name = "passager_id_fk"
                    )
            )
                    private Passager passager;
            @ManyToOne(
                    fetch =  FetchType.LAZY
            )
            @NonNull
            @JoinColumn(
                    name = "vole_id",
                    referencedColumnName = "vole_id",
                    foreignKey = @ForeignKey(
                            name = "vole_id_fk"
                    )
            )
                    private Vole vole;
    }