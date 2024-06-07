package com.mrf5sysadmin.ClinicaVeterinaria.service;

import com.mrf5sysadmin.ClinicaVeterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
    public List<Duenio> getDuenios();
    public void saveDuenio(Duenio duenio);
    public void editDuenio(Duenio duenio);
    public void deleteDuenio(Long Id);
    public Duenio getDuenio(Long id);
}
