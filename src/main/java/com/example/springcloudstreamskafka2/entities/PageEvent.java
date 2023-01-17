package com.example.springcloudstreamskafka2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class PageEvent {
    //nom de la page visité
    private String namepage;
    //nom de l'user qui a visite la page
    private String user;
    //la date de visite
    private Date date;
    private long duration;


}