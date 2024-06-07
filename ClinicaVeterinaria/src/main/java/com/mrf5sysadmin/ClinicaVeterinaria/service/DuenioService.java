package com.mrf5sysadmin.ClinicaVeterinaria.service;

import com.mrf5sysadmin.ClinicaVeterinaria.model.Duenio;
import com.mrf5sysadmin.ClinicaVeterinaria.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService {
    @Autowired
    IDuenioRepository interDuenio;

    @Override
    public List<Duenio> getDuenios() {
        return interDuenio.findAll();
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        interDuenio.save(duenio);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.interDuenio.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        interDuenio.deleteById(id);
    }

    @Override
    public Duenio getDuenio(Long id) {
        return interDuenio.findById(id).orElse(null);
    }
}
