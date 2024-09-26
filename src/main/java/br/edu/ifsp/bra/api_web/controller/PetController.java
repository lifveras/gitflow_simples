package br.edu.ifsp.bra.api_web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.bra.api_web.model.Pet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import br.edu.ifsp.bra.api_web.model.Pet;

@RestController
public class PetController {
    List<Pet> listaDePets = new ArrayList<> ();

    public PetController(){
        listaDePets.add(new Pet("Mingal", "Gato", 1000000));
        listaDePets.add(new Pet("Lana", "Cachorro", 1000000));
        listaDePets.add(new Pet("Pipoca", "Coelha", 1000000));
    }

    @GetMapping("/pet")
    public List<Pet> getAllPets() {
        return listaDePets;
    }   

    @PostMapping("/pet")
    public Pet createNewPet(@RequestBody Pet newPet){
        return newPet;
    }
}

// Comandos para subir ao GitHub
// 1. git add .
// 2. git commit -m "Adição de model e controller"
// 3. git push origin <meu-repo>

// Comandos para os colaboradores
// 1. git pull
