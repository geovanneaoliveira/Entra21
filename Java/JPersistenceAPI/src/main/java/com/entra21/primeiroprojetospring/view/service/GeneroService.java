package com.entra21.primeiroprojetospring.view.service;


import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDto;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<GeneroDTO> getAll(){
        return generoRepository.findAll().stream().map(gnr -> {
            GeneroDTO generoDTO = new GeneroDTO();
            generoDTO.setNome(gnr.getNome());
            generoDTO.setId(gnr.getId());
            return generoDTO;
        }).collect(Collectors.toList());
    }

    public void save(GeneroPayloadDto generoPayloadDto){
        GeneroEntity generoEntity = new GeneroEntity();
        generoEntity.setNome(generoPayloadDto.getNome());
        generoRepository.save(generoEntity);
    }

    public void deleteById(Long id){
        //generoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        generoRepository.deleteById(id);
    }

    public GeneroDTO update(Long id, String novoNome){
        GeneroEntity generoEntity = generoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        generoEntity.setNome(novoNome);
        GeneroDTO generoDTO = new GeneroDTO();
        generoDTO.setId(generoEntity.getId());
        generoDTO.setNome(generoEntity.getNome());
        return generoDTO;
    }
}
