package com.example.sifarisservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sifarisler")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sifaris {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String SifarisMarka;
    private String SifarisKatiqoriya;
    private Integer sifarisSay;


//
//    public Sifaris() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getSifarisSay() {
//        return sifarisSay;
//    }
//
//    public void setSifarisSay(Integer sifarisSay) {
//        this.sifarisSay = sifarisSay;
//    }
//
//    public String getSifarisMarka() {
//        return SifarisMarka;
//    }
//
//    public void setSifarisMarka(String sifarisMarka) {
//        SifarisMarka = sifarisMarka;
//    }
//
//    public String getSifarisKatiqoriya() {
//        return SifarisKatiqoriya;
//    }
//
//    public void setSifarisKatiqoriya(String sifarisKatiqoriya) {
//        SifarisKatiqoriya = sifarisKatiqoriya;
//    }


}
