package com.tp.entity.reservation;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ReservationID implements Serializable {

    @Column(
            name = "client_id",
            nullable = false
    )
    private Long client_id;
    @Column(
            name = "passager_id",
            nullable = false
    )
    private Long passager_id;
    @Column(
            name = "vole_id",
            nullable = false
    )
    private Long vole_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationID that = (ReservationID) o;
        return Objects.equals(client_id, that.client_id) && Objects.equals(passager_id, that.passager_id) && Objects.equals(vole_id, that.vole_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client_id, passager_id, vole_id);
    }
}
