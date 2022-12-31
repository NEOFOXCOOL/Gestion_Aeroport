package com.tp.entity;

import com.tp.entity.reservation.Client;
import com.tp.entity.reservation.Passager;
import com.tp.entity.vole.Vole;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Reserver {

    private String client_first_name;
    private String client_last_name;
    private String address;
    private String telephone;
    private String email;
    private String passager_first_name;
    private String passager_last_name;
    private Date start_vole;
    private Date end_vole;

}
