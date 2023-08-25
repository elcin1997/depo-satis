package com.example.deposervice.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Sifarisciler")
public class Sifarisci {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String ad;
    private  String soyAd;
    private  String finKod;

    public Sifarisci() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getFinKod() {
        return finKod;
    }

    public void setFinKod(String finKod) {
        this.finKod = finKod;
    }
}
