package com.mrf5sysadmin.ClinicaVeterinaria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
public class MascotaDuenioDTO {
    private String nombreMascota;
    private String especie;
    private String raza;
    private String nombreDuenio;
    private String apellidoDuenio;

    public MascotaDuenioDTO() {
    }

    public MascotaDuenioDTO(String nombreMascota, String especie, String raza, String nombreDuenio, String apellidoDuenio) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.nombreDuenio = nombreDuenio;
        this.apellidoDuenio = apellidoDuenio;
    }
}
