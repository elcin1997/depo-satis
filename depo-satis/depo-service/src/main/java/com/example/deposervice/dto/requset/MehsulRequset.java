package com.example.deposervice.dto.requset;

import jakarta.validation.constraints.NotNull;

public class MehsulRequset {
    @NotNull(message = "mehsulun markasin bos saxlamaq olmaz")
    private String marka;
    @NotNull(message = "mehsul katigoriyasin bos saxlamaq olmaz")
    private  String katiqoriya;
    @NotNull(message = "mehsulun sayin bos saxlamaq olmaz" )
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
