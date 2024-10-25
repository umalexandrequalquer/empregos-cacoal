package com.cacoal.empregos.interfaces;

import com.cacoal.empregos.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmpresaInterface extends JpaRepository<Empresa, UUID> {
}
