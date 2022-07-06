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

}
