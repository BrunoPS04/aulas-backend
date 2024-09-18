package com.example.atControladores.service;

import com.example.atControladores.model.Administrator;
import com.example.atControladores.repository.AdministratorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    public List<Administrator> getAllAdministrator() {
        return administratorRepository.findAll();
    }

    public Administrator getAdministratorById(Long id) {
        Optional<Administrator> administrator = administratorRepository.findById(id);
        return administrator.orElse(null);
    }

    public Administrator createAdministrator(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    public void deleteAdministrator(Long id) {
        administratorRepository.deleteById(id);
    }

    public Administrator updateAdministrator(Long id, Administrator administrator) {
        return administratorRepository.save(administrator);
    }
}
