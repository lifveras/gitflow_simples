package br.edu.ifsp.bra.api_web.controller;

import org.springframework.web.bind.annotation.RestController;

package br.edu.ifsp.bra.api_web.model.Pet;

@RestController
public class PetController {
<<<<<<< HEAD
    
=======
    @PostMapping("/pet")
    public Pet createNewPet(@RequestBody Pet newPet){
        return newPet;
    }
>>>>>>> dev_sabrina
}

// Comandos para subir ao GitHub
// 1. git add .
// 2. git commit -m "Adição de model e controller"
// 3. git push origin <meu-repo>

// Comandos para os colaboradores
// 1. git pull
