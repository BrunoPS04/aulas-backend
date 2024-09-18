package com.example.atControladores.controller;

import com.example.atControladores.model.Administrator;
import com.example.atControladores.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/administrators")
public class AdministratorController {
    
    @Autowired
    private AdministratorService administratorService;

    @GetMapping
    public List<Administrator>  getAllAdministrator(){
        return administratorService. getAllAdministrator();
    }

    @GetMapping("/{id}")
    public Administrator getAdministratorById(@PathVariable Long id){
        return administratorService.getAdministratorById(id);
    }

    @PostMapping
    public Administrator createAdministrator(@RequestBody Administrator administrator){
        return administratorService.createAdministrator(administrator);
    }

    @PutMapping("/{id}")
    public Administrator updateAdministrator(@PathVariable Long id, @RequestBody Administrator administrator){
        return administratorService.updateAdministrator(id, administrator);
    }

    @DeleteMapping("/{id}")
    public void deleteAdministrator(@PathVariable Long id){
        administratorService.deleteAdministrator(id);
    }

}
