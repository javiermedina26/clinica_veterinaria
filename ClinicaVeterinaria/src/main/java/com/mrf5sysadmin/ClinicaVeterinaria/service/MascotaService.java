package com.mrf5sysadmin.ClinicaVeterinaria.service;

import com.mrf5sysadmin.ClinicaVeterinaria.dto.MascotaDuenioDTO;
import com.mrf5sysadmin.ClinicaVeterinaria.model.Mascota;
import com.mrf5sysadmin.ClinicaVeterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService {
    @Autowired
    IMascotaRepository interMasco;

    @Override
    public List<Mascota> getMascotas() {
        return interMasco.findAll();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        interMasco.save(mascota);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.interMasco.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        interMasco.deleteById(id);
    }

    @Override
    public Mascota getMascota(Long id) {
        return interMasco.findById(id).orElse(null);
    }

    @Override
    public List<Mascota> getMascotaPerroRaza() {
        final String ESPECIE = "Perro";
        final String RAZA = "Caniche";
        List<Mascota> listaMascota = this.interMasco.findAll();
        List<Mascota> listaPerroRaza = new ArrayList<Mascota>();

        for(Mascota masco : listaMascota) {
            if(masco.getEspecie().equalsIgnoreCase(ESPECIE)) {
                if(masco.getRaza().equalsIgnoreCase(RAZA)) {
                    listaPerroRaza.add(masco);
                }
            }
        }

        return listaPerroRaza;
    }

    @Override
    public List<MascotaDuenioDTO> getMascoDuenios() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<MascotaDuenioDTO> listaMascotaDuenio = new ArrayList<MascotaDuenioDTO>();
        MascotaDuenioDTO mascotaDuenio = new MascotaDuenioDTO();

        for(Mascota masco : listaMascotas) {
            System.out.println(masco.getNombre());
            mascotaDuenio.setNombreDuenio(masco.getUnDuenio().getNombre());
            mascotaDuenio.setNombreMascota(masco.getNombre());
            mascotaDuenio.setApellidoDuenio(masco.getUnDuenio().getApellido());
            mascotaDuenio.setEspecie(masco.getEspecie());
            mascotaDuenio.setRaza(masco.getRaza());

            listaMascotaDuenio.add(mascotaDuenio);
            mascotaDuenio = new MascotaDuenioDTO(); //reseteo
        }

        return listaMascotaDuenio;
    }
}
