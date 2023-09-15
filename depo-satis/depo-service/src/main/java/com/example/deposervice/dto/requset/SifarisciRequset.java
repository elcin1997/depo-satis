package com.example.deposervice.dto.requset;

import jakarta.validation.constraints.NotNull;

public class SifarisciRequset {

    @NotNull(message = "ad bos ola bilmez")
    private String ad;
    @NotNull(message = "soyad bos ola bilmez")
    private  String soyAd;
    @NotNull(message = "bol ola bilmez")
    private  String finKod;

    public SifarisciRequset() {
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
