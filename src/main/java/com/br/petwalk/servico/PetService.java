package com.br.petwalk.service;

import com.br.petwalk.model.PetModel;
import com.br.petwalk.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;

    public PetModel save(PetModel model) {
        repository.save(model);
        return model;
    }

    public PetModel findId(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<PetModel> findAll() {
        return repository.findAll();
    }

}
