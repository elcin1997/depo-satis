package com.example.deposervice.dto.response;

public class MehsulReponse {
    private Long id;
    private String marka;
    private  String katiqoriya;
    private Integer say;

    public MehsulReponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKatiqoriya() {
        return katiqoriya;
    }

    public void setKatiqoriya(String katiqoriya) {
        this.katiqoriya = katiqoriya;
    }

    public Integer getSay() {
        return say;
    }

    public void setSay(Integer say) {
        this.say = say;
    }
}
