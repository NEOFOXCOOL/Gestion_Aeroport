package com.tp.entity.reservation;

import com.tp.entity.vole.Vole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reserver {

    private String client_fiert_name;
    private String client_last_name;
    private String client_address;
    private String client_telephone;
    private String client_email;
    private String passager_first_name;
    private String passager_last_name;
    private LocalDateTime date_depart;
    private LocalDateTime date_arrive;


    public Client client(){
        return new Client(
                client_fiert_name,
                client_last_name,
                client_address,
                client_telephone,
                client_email
        );
    }

    public Passager passager(){
        return  new Passager(
                passager_first_name,
                passager_last_name
        );
    }

    public Vole vole(){
        return  new Vole(
                date_depart,
                date_arrive
        );
    }

}
