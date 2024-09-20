package br.edu.ifsp.bra.api_web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.bra.api_web.model.Pet;


@RestController
public class PetController {
    List<Pet> listaDePets = new ArrayList<>();

    public PetController(){
        listaDePets.add(
            new Pet("Teco", "Cachorro",
            10000)
        );
        listaDePets.add(
            new Pet("Lobo", "Hamster",
            99999)
        );
    }

    // Endpoint que busca um Pet por id
    @GetMapping("/pet/{id}")
    public Pet getPetById(
        @PathVariable("id") Long idPet) 
    {
        return listaDePets.get(idPet.intValue() - 1);
    }
    
}

// Comandos para subir ao GitHub
// 1. git add .
// 2. git commit -m "Adição de model e controller"
// 3. git push origin <meu-repo>

// Comandos para os colaboradores
// 1. git pull

// mostrar todas sa branches
// 1. git branch -l