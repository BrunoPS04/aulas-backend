package com.example.atControladores.service;

import com.example.atControladores.model.Pet;
import com.example.atControladores.repository.PetRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;
    
    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }
    
    public Pet getPetById(Long id){
        Optional<Pet> pet = petRepository.findById(id);
        return pet.orElse(null);
    }
    
    public Pet createPet(Pet pet){
        return petRepository.save(pet);
    }
    
    public void deletePet(Long id){
        petRepository.deleteById(id);
    }


    public Pet updatePet(Long id, Pet pet){
       return petRepository.save(pet);
    }



}
