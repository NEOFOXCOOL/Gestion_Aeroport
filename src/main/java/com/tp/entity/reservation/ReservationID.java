package com.tp.entity.reservation;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ReservationID implements Serializable {

    @Column(name = "clientId")
    private Long clientId;
    @Column(name = "passagerId")
    private Long passagerId;
    @Column(name = "voleId")
    private Long voleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationID reserver = (ReservationID) o;
        return Objects.equals(clientId, reserver.clientId) && Objects.equals(passagerId, reserver.passagerId) && Objects.equals(voleId, reserver.voleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, passagerId, voleId);
    }
}
