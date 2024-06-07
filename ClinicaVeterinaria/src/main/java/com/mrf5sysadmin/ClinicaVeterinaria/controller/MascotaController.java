package com.mrf5sysadmin.ClinicaVeterinaria.controller;

import com.mrf5sysadmin.ClinicaVeterinaria.dto.MascotaDuenioDTO;
import com.mrf5sysadmin.ClinicaVeterinaria.model.Duenio;
import com.mrf5sysadmin.ClinicaVeterinaria.model.Mascota;
import com.mrf5sysadmin.ClinicaVeterinaria.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    IMascotaService interMascota;

    @PostMapping("mascotas/crear")
    public String createMascota(@RequestBody Mascota mascota) {
        interMascota.saveMascota(mascota);
        return "Registro creado correctamente";
    }

    @GetMapping("mascotas/traer")
    public List<Mascota> getMascota() {
        return interMascota.getMascotas();
    }

    @PutMapping("mascotas/editar")
    public String editMascota(@RequestBody Mascota mascota) {
        interMascota.editMascota(mascota);
        return "Registro actualizado satisfactoriamente";
    }

    @GetMapping("mascotas/borrar/{idDuenio}")
    public String deleteMascota(@PathVariable Long idMascota) {
        interMascota.deleteMascota(idMascota);
        return "Registro eliminado satisfactoriamente";
    }

    @GetMapping("mascotas/perro/raza")
    public List<Mascota> getMascotaPerroRaza() {
        return interMascota.getMascotaPerroRaza();
    }

    @GetMapping("/mascotas/duenios")
    public List<MascotaDuenioDTO> getMascotasDuenios() {
        return interMascota.getMascoDuenios();
    }
}
