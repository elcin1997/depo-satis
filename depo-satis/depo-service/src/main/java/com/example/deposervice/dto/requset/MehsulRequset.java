package com.example.deposervice.dto.requset;

public class MehsulRequset {
    private String marka;
    private  String katiqoriya;
    private Integer say;

    public MehsulRequset() {
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
