package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.ItemDTO;
import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import com.entra21.primeiroprojetospring.view.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemDTO> getAll(Long idGenero){
        List<ItemEntity> list = new ArrayList<>();
        if(idGenero != null){
            list = itemRepository.findAllByGeneros_Id(idGenero);
        } else {
            list = itemRepository.findAll();
        }
        return itemRepository.findAll().stream().map(it -> {
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setId(it.getId());
            itemDTO.setTitulo(it.getTitulo());
            itemDTO.setEmprestado(it.getEmprestado());
            itemDTO.setTipo(it.getType());
            return itemDTO;
        }).collect(Collectors.toList());
    }
}
