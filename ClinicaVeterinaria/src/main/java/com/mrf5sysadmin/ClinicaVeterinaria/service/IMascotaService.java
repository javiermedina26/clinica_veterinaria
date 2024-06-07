package com.mrf5sysadmin.ClinicaVeterinaria.service;

import com.mrf5sysadmin.ClinicaVeterinaria.dto.MascotaDuenioDTO;
import com.mrf5sysadmin.ClinicaVeterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
    public List<Mascota> getMascotas();
    public void saveMascota(Mascota mascota);
    public void editMascota(Mascota mascota);
    public void deleteMascota(Long id);
    public Mascota getMascota(Long id);
    public List<Mascota> getMascotaPerroRaza();
    public List<MascotaDuenioDTO> getMascoDuenios();
}
