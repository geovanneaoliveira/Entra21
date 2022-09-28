package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import com.entra21.primeiroprojetospring.view.service.FranquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/franquias")
public class FranquiaRestController {

    @Autowired
    private FranquiaService franquiaService;

    @GetMapping("/{id}")
    public ResponseEntity<FranquiaDTO> getFranquia(@PathVariable(name = "id")Long id){
        Optional<FranquiaDTO> franquiaDTO = franquiaService.getAll().stream()
                .filter(fr -> Objects.equals(fr.getId(), id)).findFirst();
        return franquiaDTO.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<FranquiaDTO> getFranquias(){
        return franquiaService.getAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody FranquiaPayloadDTO franquiaPayloadDTO){
        franquiaService.save(franquiaPayloadDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id")Long id){
        franquiaService.delete(id);
    }

    @PutMapping("/{id}")
    public FranquiaDTO updateFranquia(@PathVariable(name = "id")Long id, @RequestBody String novoNome){
        return franquiaService.update(id, novoNome);
    }
}
