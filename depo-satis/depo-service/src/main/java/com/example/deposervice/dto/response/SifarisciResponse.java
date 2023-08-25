package com.example.deposervice.dto.response;

public class SifarisciResponse {
    private  Long id;
    private String ad;
    private  String soyAd;
    private  String finKod;

    public SifarisciResponse() {
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
