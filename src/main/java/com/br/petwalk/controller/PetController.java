package com.br.petwalk.controller;

import com.br.petwalk.model.PetModel;
import com.br.petwalk.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService service;

    @PostMapping
    public PetModel cadastrarPet(@RequestBody PetModel model){
        return service.save(model);
    }

    @GetMapping("/{id}")
    public PetModel buscarPorId(@PathVariable Long id){
        return service.findId(id);
    }

    @GetMapping
    public List<PetModel> buscarTodosPets(){
        return service.findAll();
    }
    
    //modificacoes yure
    
    @PatchMapping("/{id}")
    public PetModel atualizarPet(@PathVariable Long id, @RequestBody PetModel model){
        return service.update(id, model);
    }

    @DeleteMapping("/{id}")
    public void deletarPet(@PathVariable Long id){
        service.deletar(id);
    }
    

}
