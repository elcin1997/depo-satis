package com.example.deposervice.repository;

import com.example.deposervice.domain.Mehsul;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MehsulRepository  extends JpaRepository<Mehsul,Long> {
    Optional<Mehsul> getMehsulByMarka(String marka);


}
