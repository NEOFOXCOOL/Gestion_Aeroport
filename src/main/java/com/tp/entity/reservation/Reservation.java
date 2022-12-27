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
            @NonNull
            private LocalDateTime date_reservation = LocalDateTime.now();

            //ER party
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @NonNull
            private Client client;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @NonNull
            private Passager passager;
    @ManyToOne(
            fetch =  FetchType.LAZY
    )
    @NonNull
            private Vole vole;
    }