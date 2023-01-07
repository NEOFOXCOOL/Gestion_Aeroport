package com.app.manager.entity.reservation;

import com.app.manager.entity.vole.Vole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Reservation")
@Table(name = "reservation")
@JsonIgnoreProperties({"client"})
public class Reservation {

    /*
    * EmbeddedID of Reservation Class with Classes : Client, Passager and Vole
    * */

    @EmbeddedId
    private ReservationID id;

    /*
    * Date of reservation
    * Column name date_reservation with "TIMESTAMP WITHOUT TIME ZONE"
    * */

    @Column(
                    name = "date_reservation",
                    nullable = false,
                    columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
            )
            private LocalDateTime date_reservation ;


    /*
    * Mapping RelationShip
    * */

    // Client mapping
    @ManyToOne()
    @MapsId("clientID")
    @JoinColumn(name = "client_id")
    private Client client;

    //Passager mapping
    @ManyToOne()
    @MapsId("passagerID")
    @JoinColumn(name = "passager_id")
    private Passager passager;


    // Vole mapping
    @ManyToOne()
    @MapsId("voleID")
    @JoinColumn(name = "vole_id")
    private Vole vole;

    public Reservation(ReservationID id, LocalDateTime date_reservation, Client client, Passager passager, Vole vole) {
        this.id = id;
        this.date_reservation = date_reservation;
        this.client = client;
        this.passager = passager;
        this.vole = vole;
    }

    public Reservation() {
    }

    public Reservation(LocalDateTime date_reservation, Client client, Passager passager, Vole vole) {
        this.date_reservation = date_reservation;
        this.client = client;
        this.passager = passager;
        this.vole = vole;
    }

    public ReservationID getId() {
        return id;
    }

    public LocalDateTime getDate_reservation() {
        return date_reservation;
    }

    public Client getClient() {
        return client;
    }

    public Passager getPassager() {
        return passager;
    }

    public Vole getVole() {
        return vole;
    }

    public void setId(ReservationID id) {
        this.id = id;
    }

    public void setDate_reservation(LocalDateTime date_reservation) {
        this.date_reservation = date_reservation;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    public void setVole(Vole vole) {
        this.vole = vole;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date_reservation=" + date_reservation +
                ", client=" + client +
                ", passager=" + passager +
                ", vole=" + vole +
                '}';
    }
}