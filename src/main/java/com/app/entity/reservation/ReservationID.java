package com.app.entity.reservation;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReservationID implements Serializable {

    // ID client
    @Column(
            name = "client_id",
            nullable = false
    )
    private Long clientID;

    //ID passager
    @Column(
            name = "passager_id",
            nullable = false
    )
    private Long passagerID;

    //ID vole
    @Column(
            name = "vole_id",
            nullable = false
    )
    private Long voleID;

    public ReservationID() {

    }

    public ReservationID(Long clientID, Long passagerID, Long voleID) {
        this.clientID = clientID;
        this.passagerID = passagerID;
        this.voleID = voleID;
    }

    // Equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationID that = (ReservationID) o;
        return Objects.equals(clientID, that.clientID) && Objects.equals(passagerID, that.passagerID) && Objects.equals(voleID, that.voleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientID, passagerID, voleID);
    }

    public Long getClientID() {
        return clientID;
    }

    public Long getPassagerID() {
        return passagerID;
    }

    public Long getVoleID() {
        return voleID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public void setPassagerID(Long passagerID) {
        this.passagerID = passagerID;
    }

    public void setVoleID(Long voleID) {
        this.voleID = voleID;
    }
}
