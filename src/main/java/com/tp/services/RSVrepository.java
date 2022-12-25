package com.tp.services;

import com.tp.entity.Client;
import com.tp.entity.Passager;
import com.tp.entity.Reservation;
import com.tp.entity.Vole;

public interface RSVrepository {
    Client saveClient(Client client);
    Passager savePassager(Passager passager);
    Vole saveVole(Vole vole);
    Reservation saveReservation(Reservation reservation);
}
