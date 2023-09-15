package com.example.deposervice.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Mehsullar")
public class Mehsul {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marka;
    private  String katiqoriya;
    private Integer say;

    public Mehsul() {
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
