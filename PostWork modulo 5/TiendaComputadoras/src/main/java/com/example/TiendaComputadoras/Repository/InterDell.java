package com.example.TiendaComputadoras.Repository;

import com.example.TiendaComputadoras.model.Dell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterDell extends JpaRepository<Dell, Long> {
    // public Dell validar();
}
