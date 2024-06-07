package com.mrf5sysadmin.ClinicaVeterinaria.repository;

import com.mrf5sysadmin.ClinicaVeterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
}
