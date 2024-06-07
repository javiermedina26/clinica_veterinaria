package com.mrf5sysadmin.ClinicaVeterinaria.controller;

import com.mrf5sysadmin.ClinicaVeterinaria.model.Duenio;
import com.mrf5sysadmin.ClinicaVeterinaria.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {
    @Autowired
    IDuenioService interDuenio;

    @PostMapping("duenios/crear")
    public String createDuenio(@RequestBody Duenio duenio) {
        interDuenio.saveDuenio(duenio);
        return "Registro creado correctamente";
    }

    @GetMapping("duenios/traer")
    public List<Duenio> getDuenios() {
        return interDuenio.getDuenios();
    }

    @PutMapping("duenios/editar")
    public String editDuenio(@RequestBody Duenio duenio) {
        interDuenio.editDuenio(duenio);
        return "Registro actualizado satisfactoriamente";
    }

    @GetMapping("duenios/borrar/{idDuenio}")
    public String deleteDuenio(@PathVariable Long idDuenio) {
        interDuenio.deleteDuenio(idDuenio);
        return "Registro eliminado satisfactoriamente";
    }
}
