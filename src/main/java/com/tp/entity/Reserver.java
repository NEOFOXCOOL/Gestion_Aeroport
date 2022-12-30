package com.tp.entity;

import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Passager;
import com.tp.entity.vole.Vole;

import java.time.LocalDateTime;

public class Reserver {

    private String client_first_name;
    private String client_last_name;
    private String address;
    private String telephone;
    private String email;
    private String passager_first_name;
    private String passager_last_name;
    private LocalDateTime start_vole;
    private LocalDateTime end_vole;

    public Client infoClient(){
    return new Client(
            client_first_name,
            client_last_name,
            address,
            telephone,
            email
    );
    }

    public Passager infoPassager(){
        return  new Passager(
               passager_first_name,
                passager_last_name
        );
    }

    public Vole infoVole(){
        return new Vole(
                start_vole,
                end_vole
        );
    }


}
