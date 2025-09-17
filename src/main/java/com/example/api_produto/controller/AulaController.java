package com.example.api_produto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.api_produto.model.Aula;
import com.example.api_produto.repository.AulaRepository;

@RestController
@RequestMapping("/aulas")
public class AulaController {

    private final AulaRepository repository;

    public AulaController(AulaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Aula criar(@RequestBody Aula aula) {
        return repository.save(aula);
    }

    @GetMapping
    public List<Aula> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Aula buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Aula atualizar(@PathVariable Long id, @RequestBody Aula novaAula) {
        return repository.findById(id).map(aula -> {
            aula.setTitulo(novaAula.getTitulo());
            aula.setIdTranscricao(novaAula.getIdTranscricao());
            return repository.save(aula);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
